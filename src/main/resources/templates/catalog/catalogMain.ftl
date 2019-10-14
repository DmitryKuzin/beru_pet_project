<#include "../baseTemplate.ftl">

<#macro page_body>
    <#if username??>
    <p>Hello ${username}!</p>
    </#if>

<h2>Catalog</h2>
</#macro>

<@display_page/>