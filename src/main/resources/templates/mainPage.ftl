<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
<h1>BERU MARKETPLACE</h1>
<#if username??>
    <p>Hello ${username}, nice to see you again!</p>
<#else>
    <p>You can authorize here <a href="/login">Sign in</a> </p>
</#if>

</body>
</html>