<#include "../baseTemplate.ftl">

<#macro page_title>
    Страница авторизации
</#macro>

<#macro page_body>
<div class="container">
    <div class="row" style="height: 200px;"></div>
    <div class="row">
        <h1>Войти</h1>
    </div>
    <div class="row">
        <div class="col-sm"></div>
        <div class="col-sm">
            <form action="/login" method="post">
                <div class="form-group">
                    <label for="exampleInputEmail1">Логин</label>
                    <input type="text" name="username" class="form-control" id="exampleInputLogin" placeholder="Логин">
                </div>
                <div class="form-group">
                    <label for="exampleInputPassword1">Пароль</label>
                    <input type="password" name="password" class="form-control" id="exampleInputPassword1" placeholder="Пароль">
                </div>
            <#--<div class="form-group form-check">-->
            <#--<input type="checkbox" class="form-check-input" id="exampleCheck1">-->
            <#--<label class="form-check-label" for="exampleCheck1">Запомнить меня</label>-->
            <#--</div>-->
                <button type="submit" class="btn btn-primary">Войти</button>
            </form>
        </div>
        <div class="col-sm"></div>
    </div>
    <div class="row">Or you can register <a style="margin-left: 5px; text-decoration: underline;" href="/signup">here</a></div>
</div>
</#macro>

<@display_page/>