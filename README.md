### [EN](#EN) | [RU](#RU)

# <a name="RU"></a>Требования к запуску проекта
- Создать базу данных. Работоспособность программы была проверена при созданной БД в pgAdmin4
- Необходимо заполнить файл application.properties в src.main.resources для доступа к БД:
    - **Адрес БД** ```spring.datasource.url:``` \
      Пример: ```spring.datasource.url = jdbc:postgresql://localhost:5432/Users```
    - **Имя пользователя БД** ```spring.datasource.username```
    - **Пароль данного пользователя** ```spring.datasource.password```
- Чтобы увидеть SwaggerUi перейти после запуска проекта по ссылке:  http://localhost:8080/swagger-ui/index.html
# Требования к проекту
Добавление Swagger-документации и HATEOAS в API.

Требования

 - Задокументировать существующее API (из задания 4) с помощью Swagger (Springdoc OpenAPI), 
чтобы можно было легко изучить и тестировать API через веб-интерфейс.
 - Добавить поддержку HATEOAS, чтобы API предоставляло ссылки для навигации по ресурсам.

# <a name="EN"></a>Requirements for project to run
- Create DB. The program was tested using DB created in pgAdmin4
- Fill in missing parts in hibernate.properties located in src.main.resources to access your DB:
    - Location of your created DB ```spring.datasource.url```:\
      Example: ```spring.datasource.url: = jdbc:postgresql://localhost:5432/Users```
    - DB User's name ```spring.datasource.username```
    - DB User's password ```spring.datasource.password ```
- To see SwaggerUI you need to start the project and use this link: http://localhost:8080/swagger-ui/index.html