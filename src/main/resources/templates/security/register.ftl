<#include "../baseTemplate.ftl">

<#macro page_title>
    Регистрация нового пользователя
</#macro>

<#macro page_body>
    <div class="container">
        <div class="row" style="height: 200px;"></div>
        <div class="row">
            <h1>Создать аккаунт</h1>
        </div>
        <div class="row">
            <div class="col-sm"></div>
            <div class="col-sm">
                <form action="/register" method="post">
                    <div class="form-group">
                        <label for="exampleInputEmail1">Email address</label>
                        <input type="text" name="username" class="form-control" id="exampleInputLogin" placeholder="Логин">
                    </div>
                    <div class="form-group">
                        <label for="exampleInputPassword1">Password</label>
                        <input type="password" name="password" class="form-control" id="exampleInputPassword1" placeholder="Пароль">
                    </div>
                    <button type="submit" class="btn btn-primary">Создать аккаунт</button>
                </form>
            </div>
            <div class="col-sm"></div>
        </div>
    </div>
</#macro>

<@display_page/>