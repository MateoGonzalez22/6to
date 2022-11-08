from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.firefox.options import Options
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
import time
import random

nombres = [
  {
    "nombre": "Shaw"
  },
  {
    "nombre": "Stanton"
  },
  {
    "nombre": "Lena"
  },
  {
    "nombre": "Naomi"
  },
  {
    "nombre": "Shelton"
  },
  {
    "nombre": "Elaine"
  },
  {
    "nombre": "Hutchinson"
  },
  {
    "nombre": "Trudy"
  },
  {
    "nombre": "Mooney"
  },
  {
    "nombre": "Leah"
  },
  {
    "nombre": "Cherry"
  },
  {
    "nombre": "Odessa"
  },
  {
    "nombre": "Lott"
  },
  {
    "nombre": "Pace"
  },
  {
    "nombre": "Madden"
  },
  {
    "nombre": "Boyd"
  },
  {
    "nombre": "Emma"
  },
  {
    "nombre": "Dixon"
  },
  {
    "nombre": "Velasquez"
  },
  {
    "nombre": "Mcfarland"
  },
  {
    "nombre": "Carolyn"
  },
  {
    "nombre": "Robin"
  },
  {
    "nombre": "Helga"
  },
  {
    "nombre": "Becker"
  },
  {
    "nombre": "Rosa"
  },
  {
    "nombre": "Eaton"
  },
  {
    "nombre": "Jeannette"
  },
  {
    "nombre": "Ericka"
  },
  {
    "nombre": "Valentine"
  },
  {
    "nombre": "Jocelyn"
  },
  {
    "nombre": "Tessa"
  },
  {
    "nombre": "King"
  },
  {
    "nombre": "Henry"
  },
  {
    "nombre": "Christian"
  },
  {
    "nombre": "Houston"
  },
  {
    "nombre": "Velazquez"
  },
  {
    "nombre": "Margie"
  },
  {
    "nombre": "Leanna"
  },
  {
    "nombre": "Erna"
  },
  {
    "nombre": "Freda"
  },
  {
    "nombre": "Coffey"
  },
  {
    "nombre": "Baxter"
  },
  {
    "nombre": "Koch"
  },
  {
    "nombre": "Wallace"
  },
  {
    "nombre": "Johanna"
  },
  {
    "nombre": "Flowers"
  },
  {
    "nombre": "Quinn"
  },
  {
    "nombre": "Bowman"
  },
  {
    "nombre": "Mercado"
  },
  {
    "nombre": "Sadie"
  },
  {
    "nombre": "Gillespie"
  },
  {
    "nombre": "Althea"
  },
  {
    "nombre": "Reid"
  },
  {
    "nombre": "Herminia"
  },
  {
    "nombre": "Meghan"
  },
  {
    "nombre": "Sargent"
  },
  {
    "nombre": "Sonja"
  },
  {
    "nombre": "Moses"
  },
  {
    "nombre": "Lydia"
  },
  {
    "nombre": "Ada"
  },
  {
    "nombre": "Kristie"
  },
  {
    "nombre": "Kristi"
  },
  {
    "nombre": "Dina"
  },
  {
    "nombre": "Miranda"
  },
  {
    "nombre": "Bass"
  },
  {
    "nombre": "Morse"
  },
  {
    "nombre": "Wiley"
  },
  {
    "nombre": "Jo"
  },
  {
    "nombre": "Pearlie"
  },
  {
    "nombre": "Vance"
  },
  {
    "nombre": "Isabel"
  },
  {
    "nombre": "Gonzalez"
  },
  {
    "nombre": "Marietta"
  },
  {
    "nombre": "Louisa"
  },
  {
    "nombre": "Helen"
  },
  {
    "nombre": "Christy"
  },
  {
    "nombre": "Madeline"
  },
  {
    "nombre": "Roxie"
  },
  {
    "nombre": "Teri"
  },
  {
    "nombre": "Hooper"
  },
  {
    "nombre": "Geraldine"
  },
  {
    "nombre": "Butler"
  },
  {
    "nombre": "Meagan"
  },
  {
    "nombre": "Ava"
  },
  {
    "nombre": "Gentry"
  },
  {
    "nombre": "Nixon"
  },
  {
    "nombre": "Corinne"
  },
  {
    "nombre": "Jody"
  },
  {
    "nombre": "Carey"
  },
  {
    "nombre": "Curry"
  },
  {
    "nombre": "Nanette"
  },
  {
    "nombre": "Wiggins"
  },
  {
    "nombre": "Kent"
  },
  {
    "nombre": "Terra"
  },
  {
    "nombre": "Cathleen"
  },
  {
    "nombre": "Larson"
  },
  {
    "nombre": "Parks"
  },
  {
    "nombre": "Mamie"
  },
  {
    "nombre": "Hopper"
  },
  {
    "nombre": "Shepard"
  }
]

nuevoUser = random.choice(nombres)["nombre"]
nuevoClub = random.choice(nombres)["nombre"]
nuevoUsuario = random.choice(nombres)["nombre"]
firefox_options = Options()

# firefox_options.add_argument("--no-sandbox")
# firefox_options.add_argument("--disable-extensions")
# firefox_options.add_argument("--disable-gpu")
# firefox_options.add_argument("--headless")
driver = webdriver.Firefox(options = firefox_options)

driver.get("http://localhost:3000/")

# Loguea con admin

def login(username):

    WebDriverWait(driver, 30).until(EC.visibility_of_element_located((By.ID, 'login-button'))).click()
    WebDriverWait(driver, 30).until(EC.visibility_of_element_located((By.ID, 'usuario-input'))).send_keys(username)
    driver.find_element(By.ID, "contraseña-input").send_keys(username)
    driver.find_element(By.ID, 'post-login').click()

#Crea el club

def crear_club(username, nombreClub):
    WebDriverWait(driver, 30).until(EC.visibility_of_element_located((By.ID, 'register-club'))).click()

    WebDriverWait(driver, 30).until(EC.visibility_of_element_located((By.ID, 'username'))).send_keys(username)
    driver.find_element(By.ID, 'mail').send_keys(username + "@gmail.com")
    driver.find_element(By.ID, 'club').send_keys(nombreClub)
    driver.find_element(By.ID, 'add-club').click()
    WebDriverWait(driver, 10).until(EC.invisibility_of_element_located((By.ID, 'add-club')))



# se desloguea
def logout(rol):
    WebDriverWait(driver, 30).until(EC.visibility_of_element_located((By.ID, rol+'-logout'))).click()

#se loguea con ese club reutilizar def login
# WebDriverWait(driver, 30).until(EC.visibility_of_element_located((By.ID, 'login-button'))).click()
# user = WebDriverWait(driver, 30).until(EC.visibility_of_element_located((By.ID, 'usuario-input'))).send_keys(nuevoUser)
# driver.find_element(By.ID, "contraseña-input").send_keys(nuevoUser)
# driver.find_element(By.ID, 'post-login').click()

def agregar_y_entrar_en_sucursal(direccion):

    WebDriverWait(driver, 30).until(EC.visibility_of_element_located((By.ID, 'add-sucursal'))).click()
    WebDriverWait(driver, 30).until(EC.visibility_of_element_located((By.ID, 'direccion-input'))).send_keys(direccion)
    driver.find_element(By.ID, "agregar-sucursal-button").click()
    WebDriverWait(driver, 10).until(EC.invisibility_of_element_located((By.ID, "agregar-sucursal-button")))
    driver.find_element(By.ID, direccion).click()


def post_empleado():
    WebDriverWait(driver, 30).until(EC.visibility_of_element_located((By.XPATH, '//button[normalize-space()="Empleados"]'))).click()

    # Post empleado
    WebDriverWait(driver, 30).until(EC.visibility_of_element_located((By.ID, 'post-empleado'))).click()

    WebDriverWait(driver, 30).until(EC.visibility_of_element_located((By.NAME, "nombre"))).send_keys("Pepito")
    driver.find_element(By.NAME, "apellido").send_keys("Hernandez")
    driver.find_element(By.NAME, "dni").send_keys("53252352")
    driver.find_element(By.NAME, "telefono").send_keys("1133123232")
    driver.find_element(By.NAME, "certificadoMedico").send_keys("2022-02-10")
    driver.find_element(By.NAME, "tipo").send_keys("Mantenimiento")
    driver.find_element(By.NAME, "mail").send_keys("pepito@gmail.com")
    driver.find_element(By.NAME, "direccion").send_keys("Congreso 1321")
    driver.find_element(By.ID, "send-post-empleado").click()
    WebDriverWait(driver, 30).until(EC.invisibility_of_element_located((By.XPATH, '//div[normalize-space()="Agregar Socio"]')))

def edit_empleado():
    # edit empleado
    WebDriverWait(driver, 30).until(EC.visibility_of_element_located((By.ID, 'buscar-empleado'))).send_keys("Pepito")
    WebDriverWait(driver, 30).until(EC.visibility_of_element_located((By.ID, 'search-empleado-button'))).click()
    WebDriverWait(driver, 30).until(EC.visibility_of_element_located((By.XPATH, '//div[normalize-space()="Pepito"]'))).click()
    WebDriverWait(driver, 30).until(EC.visibility_of_element_located((By.ID, 'handle-edit-empleado'))).click()

    edit_empleado_dni = WebDriverWait(driver, 30).until(EC.visibility_of_element_located((By.NAME, "dni")))
    edit_empleado_dni.clear()
    edit_empleado_dni.send_keys("99999999")

    edit_empleado_apellido = driver.find_element(By.NAME, "apellido")
    edit_empleado_apellido.clear()
    edit_empleado_apellido.send_keys("Fernandez")

    driver.find_element(By.ID, "save-edit-button").click()
    WebDriverWait(driver, 30).until(EC.invisibility_of_element_located((By.XPATH, '//div[normalize-space()="Edicion Empleado"]')))
    

def delete_empleado():
    # Delete empleado
    input = WebDriverWait(driver, 30).until(EC.visibility_of_element_located((By.ID, 'buscar-empleado')))
    input.clear()   
    input.send_keys("Pepito")

    WebDriverWait(driver, 30).until(EC.visibility_of_element_located((By.ID, 'search-empleado-button'))).click()
    WebDriverWait(driver, 30).until(EC.visibility_of_element_located((By.XPATH, '//div[normalize-space()="Pepito"]'))).click()
    WebDriverWait(driver, 30).until(EC.visibility_of_element_located((By.ID, 'handle-edit-empleado'))).click()

    WebDriverWait(driver, 30).until(EC.visibility_of_element_located((By.ID, 'delete-empleado'))).click()
    WebDriverWait(driver, 30).until(EC.invisibility_of_element_located((By.XPATH, '//div[normalize-space()="Edicion Empleado"]')))

def salir_de_sucursal():

    WebDriverWait(driver, 30).until(EC.visibility_of_element_located((By.ID,"menu-drawer"))).click()
    driver.find_element(By.XPATH, '//div[normalize-space()="Salir de la Sucursal"]').click()
    WebDriverWait(driver, 30).until(EC.visibility_of_element_located((By.ID, "panel"))).click()


def crear_usuario(usuario, sucursalCreada):

    WebDriverWait(driver, 30).until(EC.visibility_of_element_located((By.XPATH, '//div[normalize-space()="Usuarios"]'))).click()

    WebDriverWait(driver, 30).until(EC.visibility_of_element_located((By.ID, "post-usuario"))).click()

    WebDriverWait(driver, 30).until(EC.visibility_of_element_located((By.NAME, "username"))).send_keys(usuario)
    driver.find_element(By.NAME, "mail").send_keys(usuario)

    driver.find_element(By.NAME, sucursalCreada).click()

    driver.find_element(By.XPATH, '//button[normalize-space()="Crear Usuario"]').click()

    WebDriverWait(driver, 30).until(EC.invisibility_of_element_located((By.NAME, "mail")))






login("admin")
crear_club(nuevoUser, nuevoClub)
logout("admin")
login(nuevoUser)
agregar_y_entrar_en_sucursal("Medrano")
post_empleado()
edit_empleado()
delete_empleado()
salir_de_sucursal()
crear_usuario(nuevoUsuario, "Medrano")
logout("super")
login(nuevoUsuario)


time.sleep(3)

driver.quit()



#db.usuarios.deleteMany({username: { $nin: ["admin", "mateo"] }})
