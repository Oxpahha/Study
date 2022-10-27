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
time.sleep(5)
driver.find_element(By.ID, "admin_email").send_keys("moderat@neapro.ru")
driver.find_element(By.ID, "admin_password").send_keys("Aa123456")
driver.find_element(By.NAME, "commit").click()
driver.find_element(By.LINK_TEXT, "Сотрудники").click()
driver.find_element(By.LINK_TEXT, "Администраторы").click()
driver.find_element(By.LINK_TEXT, "Создано").click()
time.sleep(5)
driver.find_element(By.LINK_TEXT, "Создано").click()

#Open site
driver.get("https://adminqa.neapro.site/login")
driver.maximize_window()
time.sleep(5)