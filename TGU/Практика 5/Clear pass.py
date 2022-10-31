from lib2to3.pgen2 import driver
from multiprocessing.connection import wait
import time
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.chrome.service import Service

s = Service('C:/Users/User/Documents/chromedriver/chromedriver.exe')
driver = webdriver.Chrome(service=s)

#Open admin panel
driver.get("https://adminqa.neapro.site/login")
driver.maximize_window()
time.sleep(2)
driver.find_element(By.ID, "admin_email").send_keys("moderat@neapro.ru")
driver.find_element(By.ID, "admin_password").send_keys("Aa123456")
driver.find_element(By.NAME, "commit").click()
time.sleep(1)
driver.get("https://adminqa.neapro.site/users/2063")
time.sleep(1)
driver.find_element(By.XPATH, '//*/td[5]/a[3]').click()
time.sleep(1)
assert driver.switch_to.alert.text == "Вы уверены, что хотите удалить это?"
driver.switch_to.alert.accept()
time.sleep(1)

#Open site
driver.get("https://qa.neapro.site/login/")
time.sleep(5)