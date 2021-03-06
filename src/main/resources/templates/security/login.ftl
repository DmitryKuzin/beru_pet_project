<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Страница авторизации</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>

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
    <div class="row">Or you can register <a href="/signup">here</a></div>
</div>


<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</body>
</html>