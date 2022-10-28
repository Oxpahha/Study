import pytest
import time
import json
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.action_chains import ActionChains
from selenium.webdriver.support import expected_conditions
from selenium.webdriver.support.wait import WebDriverWait
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.common.desired_capabilities import DesiredCapabilities
from selenium.webdriver.chrome.service import Service

s = Service('C:/Users/User/Documents/chromedriver/chromedriver.exe')
driver = webdriver.Chrome(service=s)

#Open site
driver.get("https://qa.neapro.site/login/")
driver.set_window_size(873, 1080)
#Login
driver.find_element(By.XPATH, "//input[@type=\'text\']").send_keys("saweec9@gmail.com")
driver.find_element(By.XPATH, "//input[@type=\'password\']").send_keys("10101045")
driver.find_element(By.XPATH, "//button[@type=\'submit\']").click()
time.sleep(3)
#Fill docs Паспорт
driver.find_element(By.XPATH, "//div[2]/div[2]/div").click()
driver.find_element(By.XPATH, "//input[@id=\'surname\']").send_keys("пупа")
driver.find_element(By.XPATH, "//input[@id=\'name\']").send_keys("лупа")
driver.find_element(By.XPATH, "//input[@id=\'patronymic\']").send_keys("михайло")
driver.find_element(By.XPATH, "//input[@id='passportSeries']").send_keys(Keys.HOME)
driver.find_element(By.XPATH, "//input[@id='passportSeries']").send_keys("1234")
driver.find_element(By.XPATH, "//input[@id=\'passportNumber\']").send_keys(Keys.HOME)
driver.find_element(By.XPATH, "//input[@id=\'passportNumber\']").send_keys("123456")
driver.find_element(By.XPATH, "//input[@id=\'code\']").send_keys(Keys.HOME)
driver.find_element(By.XPATH, "//input[@id=\'code\']").send_keys("123456")
driver.find_element(By.XPATH, "//input[@id=\'cardId\']").send_keys(Keys.HOME)
driver.find_element(By.XPATH, "//input[@id=\'cardId\']").send_keys("12345678910")
driver.find_element(By.XPATH, "//input[@id=\'issued\']").send_keys("тарантиной")
#datapickers {
driver.find_element(By.XPATH, "//*[@id='birthday']/div/input").click()
time.sleep(1)
driver.find_element(By.XPATH, "/html/body/div[2]/div/div/div/div[2]/table/tbody/tr[1]/td[6]/div").click()
driver.find_element(By.XPATH, "//*[@id='dateOfIssue']/div/input").click()
time.sleep(1)
driver.find_element(By.XPATH, "/html/body/div[2]/div/div/div/div[2]/table/tbody/tr[5]/td[5]").click()
# } datapickers 
driver.find_element(By.XPATH, "//input[@id=\'phone\']").send_keys(Keys.HOME)
driver.find_element(By.XPATH, "//input[@id=\'phone\']").send_keys("8005553535")
driver.find_element(By.XPATH, "//input[@type=\'file\']").send_keys("C:\\Users\\User\\Documents\\twich\\14106406771660.jpg")
time.sleep(1)
driver.find_element(By.XPATH, "(//input[@type=\'text\'])[7]").send_keys("Краснодарский край ул п")
time.sleep(1)
driver.find_element(By.XPATH, "//*[@id='address']/div/div[2]/span[1]").click()
driver.find_element(By.XPATH, "//*[@id='privacy']").click()
driver.find_element(By.XPATH, "//*[@id='privacy']").click()
time.sleep(1)
driver.find_element(By.XPATH, "/div/div[3]/div/div/div[3]/div/div/div[2]/div[3]/div[9]/button[2]").click()
#Fill docs Диплом
time.sleep(2)
driver.find_element(By.XPATH, "//div[2]/img").click()
driver.find_element(By.XPATH, "//button[contains(.,\'Прикрепить\')]").click()
driver.find_element(By.XPATH, "//input[@type=\'file\']").send_keys("C:\\Users\\User\\Documents\\twich\\14106406771660.jpg")
driver.find_element(By.XPATH, "//button[contains(.,\'Отправить\')]").click()
#Fill docs Договор
time.sleep(2)
driver.find_element(By.XPATH, "//div[3]/div[2]/div/img").click()
driver.find_element(By.XPATH, "//button[contains(.,\'Прикрепить\')]").click()
driver.find_element(By.XPATH, "//input[@type=\'file\']").send_keys("C:\\Users\\User\\Documents\\twich\\14106406771660.jpg")
time.sleep(1)
driver.find_element(By.XPATH, "//button[contains(.,\'Отправить\')]").click()
#Fill docs Заявление
time.sleep(2)
driver.find_element(By.XPATH, "//div[3]/div[2]/div[2]").click()
driver.find_element(By.XPATH, "//button[contains(.,\'Прикрепить\')]").click()
driver.find_element(By.XPATH, "//input[@type=\'file\']").send_keys("C:\\Users\\User\\Documents\\twich\\14106406771660.jpg")
driver.find_element(By.XPATH, "//button[contains(.,\'Отправить\')]").click()
#Fill docs Согласие
time.sleep(2)
driver.find_element(By.XPATH, "//div[3]/div[2]/div[3]").click()
driver.find_element(By.XPATH, "//button[contains(.,\'Прикрепить\')]").click()
driver.find_element(By.XPATH, "//input[@type=\'file\']").send_keys("C:\\Users\\User\\Documents\\twich\\14106406771660.jpg")
driver.find_element(By.XPATH, "//button[contains(.,\'Отправить\')]").click()

