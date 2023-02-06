import time
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.action_chains import ActionChains
from selenium.webdriver.support import expected_conditions
from selenium.webdriver.support.wait import WebDriverWait
from selenium.webdriver.common.keys import Keys
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
driver.find_element(By.XPATH, "(//input[@type=\'text\'])[7]").send_keys(Keys.ARROW_DOWN)
time.sleep(1)
driver.find_element(By.XPATH, "(//input[@type=\'text\'])[7]").send_keys(Keys.ENTER)
# driver.find_element(By.XPATH, "//*[@id='address']/div/div[2]/span[1]").click()

# scroll {
time.sleep(1)
driver.execute_script("arguments[0].scrollIntoView();", driver.find_element(By.XPATH, "//*[@id='__layout']/div/div[3]/div/div/div[3]/div/div/div[2]/div[3]/div[9]/button[2]"))
time.sleep(1)
# } scroll
driver.find_element(By.XPATH, "//*[@id='__layout']/div/div[3]/div/div/div[3]/div/div/div[2]/div[3]/div[9]/button[2]").click()
#Fill docs Диплом
time.sleep(1)
driver.find_element(By.XPATH, "//div[2]/img").click()
time.sleep(1)
driver.find_element(By.XPATH, "//input[@type=\'file\']").send_keys("C:\\Users\\User\\Documents\\twich\\14106406771660.jpg")
time.sleep(1)
driver.find_element(By.XPATH, "//button[contains(.,\'Отправить\')]").click()
#Fill docs Договор
time.sleep(1)
driver.find_element(By.XPATH, "//div[3]/div[2]/div/img").click()
time.sleep(1)
driver.find_element(By.XPATH, "//input[@type=\'file\']").send_keys("C:\\Users\\User\\Documents\\twich\\14106406771660.jpg")
time.sleep(1)
driver.find_element(By.XPATH, "//button[contains(.,\'Отправить\')]").click()
# scroll {
time.sleep(1)
driver.execute_script("arguments[0].scrollIntoView();", driver.find_element(By.XPATH, "//*[@id='__layout']/div/div[3]/div/div/div[3]/div/div/div[3]/div[2]/div[3]/div[1]"))
time.sleep(1)
# } scroll
#Fill docs Заявление
time.sleep(1)
driver.find_element(By.XPATH, "//div[3]/div[2]/div[2]").click()
time.sleep(1)
driver.find_element(By.XPATH, "//input[@type=\'file\']").send_keys("C:\\Users\\User\\Documents\\twich\\14106406771660.jpg")
time.sleep(1)
driver.find_element(By.XPATH, "//button[contains(.,\'Отправить\')]").click()
# scroll {
time.sleep(1)
driver.execute_script("arguments[0].scrollIntoView();", driver.find_element(By.XPATH, "//*[@id='__layout']/div/div[3]/div/div/div[3]/div/div/div[3]/div[2]/div[3]/div[1]"))
time.sleep(1)
# } scroll
#Fill docs Согласие
time.sleep(1)
driver.find_element(By.XPATH, "//div[3]/div[2]/div[3]").click()
time.sleep(1)
driver.find_element(By.XPATH, "//input[@type=\'file\']").send_keys("C:\\Users\\User\\Documents\\twich\\14106406771660.jpg")
time.sleep(1)
driver.find_element(By.XPATH, "//button[contains(.,\'Отправить\')]").click()
#Open admin
driver.get("https://adminqa.neapro.site/login")
driver.set_window_size(873, 1080)
time.sleep(1)
#Login
driver.find_element(By.XPATH, "//*[@id='admin_email']").send_keys("moderat@neapro.ru")
driver.find_element(By.XPATH, "//*[@id='admin_password']").send_keys("Aa123456")
driver.find_element(By.XPATH, "//*[@id='admin_submit_action']/input").click()
time.sleep(3)
#Open profile
driver.get("https://adminqa.neapro.site/users/2063")
driver.set_window_size(873, 1080)
time.sleep(1)
#Accept docs
driver.find_element(By.XPATH, "//td[4]/div/div/span").click()
driver.find_element(By.XPATH, "//input[@type=\'search\']").send_keys("п")
time.sleep(1)
driver.find_element(By.XPATH, "//input[@type=\'search\']").send_keys(Keys.ENTER)
time.sleep(1)
driver.find_element(By.XPATH, "//tr[2]/td[4]/div/div/span").click()
driver.find_element(By.XPATH, "//input[@type=\'search\']").send_keys("п")
time.sleep(1)
driver.find_element(By.XPATH, "//input[@type=\'search\']").send_keys(Keys.ENTER)
time.sleep(1)
driver.find_element(By.XPATH, "//tr[3]/td[4]/div/div/span").click()
driver.find_element(By.XPATH, "//input[@type=\'search\']").send_keys("п")
time.sleep(1)
driver.find_element(By.XPATH, "//input[@type=\'search\']").send_keys(Keys.ENTER)
time.sleep(1)
driver.find_element(By.XPATH, "//tr[4]/td[4]/div/div/span").click()
driver.find_element(By.XPATH, "//input[@type=\'search\']").send_keys("п")
time.sleep(1)
driver.find_element(By.XPATH, "//input[@type=\'search\']").send_keys(Keys.ENTER)
time.sleep(1)
driver.find_element(By.XPATH, "//tr[5]/td[4]/div/div/span").click()
driver.find_element(By.XPATH, "//input[@type=\'search\']").send_keys("п")
time.sleep(1)
driver.find_element(By.XPATH, "//input[@type=\'search\']").send_keys(Keys.ENTER)
#Open site
driver.get("https://qa.neapro.site/schedule")
driver.set_window_size(873, 1080)
time.sleep(2)
# #Login
# driver.find_element(By.XPATH, "//input[@type=\'text\']").send_keys("saweec9@gmail.com")
# driver.find_element(By.XPATH, "//input[@type=\'password\']").send_keys("10101045")
# driver.find_element(By.XPATH, "//button[@type=\'submit\']").click()
# time.sleep(3)

# refresh {
time.sleep(1)
driver.execute_script("window.location.reload();")
time.sleep(1)
# } refresh
#Open secure
driver.get("https://qa.neapro.site/cabinet/security")
driver.set_window_size(873, 1080)
time.sleep(2)
# #Sidebar
# element = driver.find_element(By.XPATH, "//div[@id=\'__layout\']/div/div/div/div[2]")
# actions = ActionChains(driver)
# actions.move_to_element(element).perform()
# WebDriverWait(driver, 30).until(expected_conditions.visibility_of_element_located((By.XPATH, "//*[@id=\"__layout\"]/div/div[1]/div/div[1]/div[1]/div")))
# time.sleep(1)
# driver.find_element(By.XPATH, "//*[@id=\"__layout\"]/div/div[1]/div/div[1]/div[2]/a/div").click()
# time.sleep(1)

#Secure
driver.find_element(By.XPATH, "//*[@id='__layout']/div/div[3]/div/div/div[2]/div/div/div/div[2]/div[2]/div/img").click()
time.sleep(1)
driver.find_element(By.XPATH, "//*[@id='oldPassword']").send_keys("10101045")
driver.find_element(By.XPATH, "//*[@id='newPassword']").send_keys("10101044")
driver.find_element(By.XPATH, "//*[@id='confirmPassword']").send_keys("10101044")
time.sleep(1)
WebDriverWait(driver, 10).until(expected_conditions.visibility_of_element_located((By.XPATH, "//button[@type=\'submit\']")))
driver.find_element(By.XPATH, "//button[@type=\'submit\']").click()
time.sleep(1)
element = driver.find_element(By.XPATH, "//div[@id=\'__layout\']/div/div/div/div[2]")
actions = ActionChains(driver)
actions.move_to_element(element).perform()
WebDriverWait(driver, 10).until(expected_conditions.visibility_of_element_located((By.XPATH, "//*[@id=\"__layout\"]/div/div[1]/div/div[1]/div[1]/div")))
time.sleep(1)
driver.find_element(By.XPATH, "//*[@id=\"__layout\"]/div/div[1]/div/div[1]/div[1]/div").click()
#Open site
driver.get("https://qa.neapro.site/login/")
driver.set_window_size(873, 1080)
time.sleep(2)
#Login
driver.find_element(By.XPATH, "//input[@type=\'text\']").send_keys("saweec9@gmail.com")
driver.find_element(By.XPATH, "//input[@type=\'password\']").send_keys("10101045")
driver.find_element(By.XPATH, "//button[@type=\'submit\']").click()
time.sleep(3)
WebDriverWait(driver, 5).until(expected_conditions.visibility_of_element_located((By.XPATH, "//div[@id=\'__layout\']/div/section/div[2]/div/div/div/form/div")))
# refresh {
time.sleep(1)
driver.execute_script("window.location.reload();")
time.sleep(1)
# } refresh
#Open site
driver.get("https://qa.neapro.site/login/")
driver.set_window_size(873, 1080)
#Login
driver.find_element(By.XPATH, "//input[@type=\'text\']").send_keys("saweec9@gmail.com")
driver.find_element(By.XPATH, "//input[@type=\'password\']").send_keys("10101044")
driver.find_element(By.XPATH, "//button[@type=\'submit\']").click()
time.sleep(2)
driver.execute_script('alert(arguments[0], arguments[1]);', ('TEST COMPLETE! WELL DONE!'))
time.sleep(5)
