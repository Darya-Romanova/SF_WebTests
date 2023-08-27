# SF_WebTests
skillfactory.ru web tests

Test1 - Test7  - checking the transition to the corresponding pages of the site.

Test8 - sign up for a course form - valid data
    Steps:
    1. Click on button "Тестрование"
    2. click on banner named "QA-инженер на Java"
    3. on the newly opened tab click button "Записаться на курс"
    4. input name "Иванов Иван"
    5. input e-mail "ivanovii@gmail.com"
    6. input phone number "(999) 999-99-99"
    7. click submit

 Test9 - send contact form - valid data
    Steps:
    1. Find form for send contacts
    2. input name "Иванов Иван"
    3. input e-mail "ivanovii@gmail.com"
    4. input phone number "(999) 999-99-99"
    5. click submit

 Test10 - get a consultation form - valid data
    Steps:
     1. click on banner named "IT-специалист с нуля"
     2. on the newly opened tab click button "Получить консультацию"
     3. input name "Иванов Иван"
     4. input e-mail "ivanovii@gmail.com"
     5. input phone number "(999) 999-99-99"
     6. click submit

 Test11 - Read history
    Steps:
     1.Find Content block with histories
     2. Click on "Читать историю"


 Test12 - Ask the question form
    Steps:
     1. Click contacts
     2. click button "Задать вопрос"
     3. input name "Иванов Иван"
     4. input e-mail "ivanovii@gmail.com"
     5. input phone number "(999) 999-99-99"
     6. input question "Test"
     7. click submit

 Test13 - Go to the media
     Steps:
    1. Click button "перейти в Медиа"

 Test14 - Subscription form
    Steps:
    1. find field for input e-mail in the footer
    2. click to the field for input e-mail
    3. input e-mail "ivanovii@gmail.com"
    4. click "Подписаться"

 Test15 - Free registration for webinar form
    Steps:
    1. Click "Бесплатно"
    2.Find content with name "бесплатные вебинары и интенсивы"
    3. click first button "Зарегистироваться бесплатно"
    4. input e-mail "ivanovii@gmail.com"
    5. input phone number "(999) 999-99-99"
    6. click button "Участвую"


  Test16 - Look all materials
     Steps:
    1. Click button "смотреть все материалы"

  Test17 - Send contacts form - negative test for e-mail field (format)
    Steps:
      1. Find form for send contacts
      2. input name "Иванов Иван"
      3. input e-mail "ivanovii@gmail"
      4. input phone number "(999) 999-99-99"
      5. click submit

  Test18 - Send contacts form - negative test for e-mail field (numbers)
    Steps:
      1. Find form for send contacts
      2. input name "Иванов Иван"
      3. input e-mail "123456"
      4. input phone number "(999) 999-99-99"
      5. click submit

Test19 - Send contacts form - negative test for phone number field (not existing)
    Steps:
      1. Find form for send contacts
      2. input name "Иванов Иван"
      3. input e-mail "ivanovii@gmail.com"
      4. input phone number "(000) 000-00-00"
      5. click submit


Test20 - Send contacts form - negative test for name field (empty)
     Steps:
       1. Find form for send contacts
       2. input name ""
       3. input e-mail "ivanovii@gmail.com"
       4. input phone number "(999) 999-99-99"
       5. click submit
