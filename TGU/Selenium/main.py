import time
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.chrome.service import Service

s=Service('C:/Users/Zoram/vital/chromedriver.exe')
driver = webdriver.Chrome(service=s)
#Open site
driver.get("https://qa.neapro.site/login")
driver.maximize_window()
driver.find_element(By.CSS_SELECTOR, ".fieldset:nth-child(1) input").send_keys("test@test.ru")
driver.find_element(By.CSS_SELECTOR, ".fieldset:nth-child(2) input").send_keys("12345678")
driver.find_element(By.CSS_SELECTOR, ".btn").click()
time.sleep(5)
#Fill Pasport
driver.find_element(By.CSS_SELECTOR, ".form:nth-child(2) .document-tile:nth-child(1) > .document-name").click()
driver.find_element(By.ID, "surname").clear()
driver.find_element(By.ID, "surname").send_keys("Пупкин")
driver.find_element(By.ID, "name").clear()
driver.find_element(By.ID, "name").send_keys("Акакий")
driver.find_element(By.ID, "patronymic").clear()
driver.find_element(By.ID, "patronymic").send_keys("Михайцлович")
driver.find_element(By.ID, "passportSeries").clear()
driver.find_element(By.ID, "passportSeries").send_keys("6666")