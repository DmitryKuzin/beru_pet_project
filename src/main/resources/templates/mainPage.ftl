<#include "baseTemplate.ftl">

<#macro page_body>
    <#if username??>
    <p>Hello ${username}, nice to see you again!</p>
    <p>Here is your <a href="/cart"> cart</a></p>
    <p>Here is our catalog of <a href="/catalog"> products</a></p>
    <#else>
    <p>You can authorize here <a href="/login">Sign in</a> </p>
    </#if>
</#macro>

<@display_page/>