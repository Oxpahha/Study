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

s = Service('C:/Users/User/Documents/chromedriver/chromedriver.exe')
driver = webdriver.Chrome(service=s)

#Open site
    self.driver.get("https://qa.neapro.site/login/")
    self.driver.set_window_size(873, 1080)
    self.driver.find_element(By.XPATH, "//input[@type=\'text\']").send_keys("saweec9@gmail.com")
    self.driver.find_element(By.XPATH, "//input[@type=\'password\']").send_keys("10101045")
    self.driver.find_element(By.XPATH, "//button[@type=\'submit\']").click()
    time.sleep(2)
    self.driver.find_element(By.XPATH, "//div[2]/div[2]/div").click()
    self.driver.find_element(By.XPATH, "//input[@id=\'surname\']").send_keys("пупа")
    self.driver.find_element(By.XPATH, "//input[@id=\'name\']").send_keys("лупа")
    self.driver.find_element(By.XPATH, "//input[@id=\'patronymic\']").send_keys("михайло")
    self.driver.find_element(By.XPATH, "//input[@id=\'passportSeries\']").send_keys("12-34")
    self.driver.find_element(By.XPATH, "//input[@id=\'passportNumber\']").send_keys("123456")
    self.driver.find_element(By.XPATH, "//input[@id=\'code\']").send_keys("123-456")
    self.driver.find_element(By.XPATH, "//input[@id=\'cardId\']").send_keys("123-456-789 10")
    self.driver.find_element(By.XPATH, "//input[@id=\'issued\']").send_keys("тарантиной")
    self.driver.find_element(By.CSS_SELECTOR, "#birthday svg").click()
    self.driver.find_element(By.CSS_SELECTOR, ".mx-date-row:nth-child(1) > .cell:nth-child(5) > div").click()
    self.driver.find_element(By.CSS_SELECTOR, "#dateOfIssue .mx-input").click()
    self.driver.find_element(By.CSS_SELECTOR, ".mx-date-row:nth-child(2) > .cell:nth-child(4) > div").click()
    self.driver.find_element(By.XPATH, "//input[@id=\'phone\']").send_keys("(800)555-35 35")
    self.driver.find_element(By.XPATH, "(//input[@type=\'text\'])[7]").send_keys("Краснодарский край ул п")
    self.driver.find_element(By.CSS_SELECTOR, ".vue-dadata__suggestions-item").click()
    self.driver.find_element(By.XPATH, "//input[@type=\'file\']").send_keys("C:\\Users\\User\\Documents\\twich\\14106406771660.jpg")
    time.sleep(1)
    self.driver.find_element(By.XPATH, "//button[contains(.,\'Отправить\')]").click()
    self.driver.find_element(By.XPATH, "//div[2]/img").click()
    self.driver.find_element(By.XPATH, "//button[contains(.,\'Прикрепить\')]").click()
    self.driver.find_element(By.XPATH, "//input[@type=\'file\']").send_keys("C:\\Users\\User\\Documents\\twich\\14106406771660.jpg")
    self.driver.find_element(By.XPATH, "//button[contains(.,\'Отправить\')]").click()
    self.driver.find_element(By.XPATH, "//div[3]/div[2]/div/img").click()
    self.driver.find_element(By.XPATH, "//button[contains(.,\'Прикрепить\')]").click()
    self.driver.find_element(By.XPATH, "//input[@type=\'file\']").send_keys("C:\\Users\\User\\Documents\\twich\\14106406771660.jpg")
    self.driver.find_element(By.XPATH, "//button[contains(.,\'Отправить\')]").click()
    self.driver.find_element(By.XPATH, "//div[3]/div[2]/div[2]").click()
    self.driver.find_element(By.XPATH, "//button[contains(.,\'Прикрепить\')]").click()
    self.driver.find_element(By.XPATH, "//input[@type=\'file\']").send_keys("C:\\Users\\User\\Documents\\twich\\14106406771660.jpg")
    self.driver.find_element(By.XPATH, "//button[contains(.,\'Отправить\')]").click()
    self.driver.find_element(By.XPATH, "//div[3]/div[2]/div[3]").click()
    self.driver.find_element(By.XPATH, "//button[contains(.,\'Прикрепить\')]").click()
    self.driver.find_element(By.XPATH, "//input[@type=\'file\']").send_keys("C:\\Users\\User\\Documents\\twich\\14106406771660.jpg")
    self.driver.find_element(By.XPATH, "//button[contains(.,\'Отправить\')]").click()