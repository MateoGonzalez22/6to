from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.firefox.options import Options
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
import time

nuevoUser = "bocelo"
nuevoClub = "rojopasion"
nuevoUsuario = "nachota"
firefox_options = Options()

# firefox_options.add_argument("--no-sandbox")
# firefox_options.add_argument("--disable-extensions")
# firefox_options.add_argument("--disable-gpu")
# firefox_options.add_argument("--headless")
driver = webdriver.Firefox(options = firefox_options)

driver.get("http://localhost:3000/")

# Loguea con admin
WebDriverWait(driver, 30).until(EC.visibility_of_element_located((By.ID, 'login-button'))).click()
user = WebDriverWait(driver, 30).until(EC.visibility_of_element_located((By.ID, 'usuario-input'))).send_keys("admin")
driver.find_element(By.ID, "contraseña-input").send_keys("admin")
driver.find_element(By.ID, 'post-login').click()

#Crea el club
WebDriverWait(driver, 30).until(EC.visibility_of_element_located((By.ID, 'register-club'))).click()

WebDriverWait(driver, 30).until(EC.visibility_of_element_located((By.ID, 'username'))).send_keys(nuevoUser)
driver.find_element(By.ID, 'mail').send_keys(nuevoUser + "@gmail.com")
driver.find_element(By.ID, 'club').send_keys(nuevoClub)
driver.find_element(By.ID, 'add-club').click()

time.sleep(2)
# se desloguea
WebDriverWait(driver, 30).until(EC.visibility_of_element_located((By.ID, 'admin-logout'))).click()

#se loguea con ese club
WebDriverWait(driver, 30).until(EC.visibility_of_element_located((By.ID, 'login-button'))).click()
user = WebDriverWait(driver, 30).until(EC.visibility_of_element_located((By.ID, 'usuario-input'))).send_keys(nuevoUser)
driver.find_element(By.ID, "contraseña-input").send_keys(nuevoUser)
driver.find_element(By.ID, 'post-login').click()

WebDriverWait(driver, 30).until(EC.visibility_of_element_located((By.ID, 'add-sucursal'))).click()
WebDriverWait(driver, 30).until(EC.visibility_of_element_located((By.ID, 'direccion-input'))).send_keys("Medrano")
driver.find_element(By.ID, "agregar-sucursal-button").click()

WebDriverWait(driver, 30).until(EC.visibility_of_element_located((By.ID, 'Medrano'))).click()

WebDriverWait(driver, 30).until(EC.visibility_of_element_located((By.XPATH, '//button[normalize-space()="Empleados"]'))).click()

# Post empleado
WebDriverWait(driver, 30).until(EC.visibility_of_element_located((By.ID, 'post-empleado'))).click()

WebDriverWait(driver, 30).until(EC.visibility_of_element_located((By.NAME, "nombre"))).send_keys("Ramiro")
driver.find_element(By.NAME, "apellido").send_keys("Moya")
driver.find_element(By.NAME, "dni").send_keys("53252352")
driver.find_element(By.NAME, "telefono").send_keys("1133123232")
driver.find_element(By.NAME, "certificadoMedico").send_keys("2022-02-10")
driver.find_element(By.NAME, "tipo").send_keys("Mantenimiento")
driver.find_element(By.NAME, "mail").send_keys("ramiro@gmail.com")
driver.find_element(By.NAME, "direccion").send_keys("Luis Cabezon 1321")
driver.find_element(By.ID, "send-post-empleado").click()

# edit empleado
WebDriverWait(driver, 30).until(EC.visibility_of_element_located((By.ID, 'buscar-empleado'))).send_keys("Ramiro")
WebDriverWait(driver, 30).until(EC.visibility_of_element_located((By.ID, 'search-empleado-button'))).click()
WebDriverWait(driver, 30).until(EC.visibility_of_element_located((By.XPATH, '//div[normalize-space()="Ramiro"]'))).click()
WebDriverWait(driver, 30).until(EC.visibility_of_element_located((By.ID, 'handle-edit-empleado'))).click()

edit_empleado_dni = WebDriverWait(driver, 30).until(EC.visibility_of_element_located((By.NAME, "dni")))
edit_empleado_dni.clear()
edit_empleado_dni.send_keys("99999999")

edit_empleado_apellido = driver.find_element(By.NAME, "apellido")
edit_empleado_apellido.clear()
edit_empleado_apellido.send_keys("Gonzalez")

driver.find_element(By.ID, "save-edit-button").click()


# Delete empleado
WebDriverWait(driver, 30).until(EC.visibility_of_element_located((By.ID, 'search-empleado-button'))).click()
WebDriverWait(driver, 30).until(EC.visibility_of_element_located((By.XPATH, '//div[normalize-space()="Ramiro"]'))).click()
WebDriverWait(driver, 30).until(EC.visibility_of_element_located((By.ID, 'handle-edit-empleado'))).click()
WebDriverWait(driver, 30).until(EC.visibility_of_element_located((By.ID, 'delete-empleado'))).click()

WebDriverWait(driver, 30).until(EC.visibility_of_element_located((By.ID,"menu-drawer"))).click()
driver.find_element(By.XPATH, '//div[normalize-space()="Salir de la Sucursal"]').click()
WebDriverWait(driver, 30).until(EC.visibility_of_element_located((By.ID, "panel"))).click()


WebDriverWait(driver, 30).until(EC.visibility_of_element_located((By.XPATH, '//div[normalize-space()="Usuarios"]'))).click()

WebDriverWait(driver, 30).until(EC.visibility_of_element_located((By.ID, "post-usuario"))).click()

WebDriverWait(driver, 30).until(EC.visibility_of_element_located((By.NAME, "username"))).send_keys("pepe123")
driver.find_element(By.NAME, "mail").send_keys("matre@gmail.com")

driver.find_element(By.NAME, "Medrano").click()

driver.find_element(By.XPATH, '//button[normalize-space()="Crear Usuario"]').click()

WebDriverWait(driver, 30).until(EC.visibility_of_element_located((By.ID, "super-logout"))).click()


time.sleep(10)

driver.quit()