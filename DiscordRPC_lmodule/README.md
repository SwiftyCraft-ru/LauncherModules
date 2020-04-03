+ Описание: Добавляет лаунчеру интеграцию с Discord'ом. Тоесть, при наличии Discord'а на компьютере человека, запустившего один из ваших игровых клиентов, в его аккауте Discord'а будет показывать, что он играет именно у вас.
+ Конфигурация:

      "appId": 617731283404980249,    /--- Секция ClientID у дискорд-бота ---/
      "firstLine": "Играет на сервере %profile%",
      "secondLine": "Ник: %user%",
      "largeKey": "icon",     /--- Название главной картинки у дискорд-бота ---/
      "smallKey": "small",    /--- Название дополнительной картинки у дискорд-бота  ---/
      "largeText": "projectname.ml",    /--- Основной текст ---/
      "smallText": "servername"   /--- Дополнительный текст ---/
      
+ Дополнительные настройки: В конфиге прогуарда добавить club.minnced.discord.rpc.** в keeppackagenames и keep class
+ Альтернативная конфигурация(alt...) применяется при работе в лаунчере, тогда как основная конфигурация 