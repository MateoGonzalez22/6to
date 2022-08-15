from dotenv import load_dotenv
import os
from selenium import webdriver
from selenium.webdriver.chrome.options import Options as ChromeOptions
from selenium.webdriver.firefox.options import Options as FirefoxOptions
from selenium.webdriver.safari.options import Options as SafariOptions
from selenium.webdriver.edge.options import Options as EdgeOptions
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.common.by import By
from selenium.common.exceptions import TimeoutException
from threading import Thread
import time
# This array 'capabilities' defines the capabilities browser, device and OS combinations where the test will run
load_dotenv()
BUILD_NAME = "browserstack-build-1"
capabilities = [
    {
        "browserName": "firefox",
        "browserVersion": "102.0",
        "os": "Windows",
        "osVersion": "10",
        "sessionName": "Parallel Test 1",  # test name
        "buildName": BUILD_NAME,  # Your tests will be organized within this build
    },
    {
        "browserName": "firefox",
        "browserVersion": "102.0",
        "os": "Windows",
        "osVersion": "10",
        "sessionName": "Parallel Test 2",
        "buildName": BUILD_NAME,
    },
    {
        "browserName": "safari",
        "browserVersion": "14.1",
        "os": "OS X",
        "osVersion": "Big Sur",
        "sessionName": "Parallel Test 3",
        "buildName": BUILD_NAME,
    },
]
def get_browser_option(browser):
    switcher = {
        "chrome": ChromeOptions(),
        "firefox": FirefoxOptions(),
        "edge": EdgeOptions(),
        "safari": SafariOptions(),
    }
    return switcher.get(browser, ChromeOptions())
# run_session function searches for 'BrowserStack' on duckduckgo.com
def run_session(cap):
    cap["userName"] = os.environ.get("BROWSERSTACK_USERNAME") or "mateogonzalez_PEHcg6"
    cap["accessKey"] = os.environ.get("BROWSERSTACK_ACCESS_KEY") or "8AdyUqrUCkUGkSrARMTu"
    options = get_browser_option(cap["browserName"].lower())
    options.set_capability("browserName", cap["browserName"].lower())
    options.set_capability("bstack:options", cap)
    driver = webdriver.Remote(
        command_executor="https://hub.browserstack.com/wd/hub", options=options
    )
    driver.get("https://selenium-tute-tiago.herokuapp.com/")

    time.sleep(0.5)

    WebDriverWait(driver, 30).until(EC.element_to_be_clickable((By.XPATH, '//a[@href="./formulario.html"]'))).click()

    #time.sleep(0.5)

    WebDriverWait(driver, 30).until(EC.element_to_be_clickable((By.XPATH, "//input[@type='email']"))).send_keys("mateogonzalez132017@gmail.com")

    #time.sleep(0.2)

    driver.find_element(By.ID, "inputAddress").send_keys("Constituyentes 5880")

    #time.sleep(0.2)

    driver.find_element(By.ID, "inputPassword4").send_keys("contraseña")

    #time.sleep(0.2)

    driver.find_element(By.ID, "inputAddress2").send_keys("Casa")

    #time.sleep(0.2)

    driver.find_element(By.ID, "inputCity").send_keys("C.A.B.A")

    #time.sleep(0.2)

    driver.find_element(By.ID, "inputZip").send_keys("1430")

    #time.sleep(0.2)

    driver.find_element(By.ID, "gridCheck").click()

    #time.sleep(0.2)

    driver.find_element(By.XPATH, '//a[@href="./home.html"]').click()

    # '//input[@type="email"]'
    # '//input[@type="password"]'


    time.sleep(1)

    driver.quit()
# The Thread function takes run_session function and each set of capability from the caps array as an argument to run each session parallelly
for cap in capabilities:
    Thread(target=run_session, args=(cap,)).start()























    

