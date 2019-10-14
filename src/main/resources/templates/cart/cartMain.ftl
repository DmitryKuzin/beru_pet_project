<#include "../baseTemplate.ftl">

<#macro page_body>
    <#if username??>
    <p>Hello ${username}, this is your cart!</p>
    <#else>
    <p>You can authorize here <a href="/login">Sign in</a> </p>
    </#if>
</#macro>

<@display_page/>