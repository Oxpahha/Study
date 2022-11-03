from lib2to3.pgen2 import driver
import time
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.chrome.service import Service

s = Service('C:/Users/User/Documents/chromedriver/chromedriver.exe')
driver = webdriver.Chrome(service=s)
driver.get("https://qa.neapro.site/login/")
driver.maximize_window()
driver.find_element(By.CSS_SELECTOR, ".fieldset:nth-child(1) input").send_keys("saweec9@gmail.com")
driver.find_element(By.CSS_SELECTOR, ".fieldset:nth-child(2) input").send_keys("10101044")
driver.find_element(By.CSS_SELECTOR, ".btn").click()
time.sleep(5)

driver.find_element(By.CSS_SELECTOR, ".form:nth-child(2) .document-tile:nth-child(1) > .document-name").click()
driver.find_element(By.ID, "surname").clear()
driver.find_element(By.ID, "surname").send_keys("Весеткин")
driver.find_element(By.ID, "name").clear()
driver.find_element(By.ID, "name").send_keys("Витька")
driver.find_element(By.ID, "patronymic").clear()
driver.find_element(By.ID, "patronymic").send_keys("Михайло")
driver.find_element(By.ID, "passportSeries").clear()
driver.find_element(By.ID, "passportSeries").send_keys("1234")
driver.find_element(By.ID, "passportNumber").clear()
driver.find_element(By.ID, "passportNumber").send_keys("123456")
driver.find_element(By.CSS_SELECTOR, "By.CSS_SELECTOR, #dateOfIssue .mx-input").clear()
driver.find_element(By.CSS_SELECTOR, "By.CSS_SELECTOR, #dateOfIssue .mx-input").send_keys("16.12.1980")
