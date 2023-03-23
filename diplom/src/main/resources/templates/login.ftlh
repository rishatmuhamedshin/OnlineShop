<!DOCTYPE html>
<html>
<head>
    <title>BUY SELL</title>
</head>
<body>
<h1>BUYSELL</h1>
<h4>Авторизация</h4>

<form action="/login" method="post">
    Эл.почта: <input type="email" name="username"><br><br>
    Пароль: <input type="password" name="password"><br><br>
    <input type="hidden" name="_crsf" value="${_crsf.token}">
    <input type="submit" value="Вход">
</form>
<a href="/registration">Зарегестрироваться</a>
</body>
</html>