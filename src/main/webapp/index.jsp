<html>

<h2>Hello World!</h2>
<form id="testform" action=""   onsubmit="getUrl()" method="post">
<input type="text" id="mytest">
<input type="submit" value="Submit" />
</form>

<script type="text/javascript">
function getUrl() {
    document.getElementById('testform')
        .setAttribute('action',"/encodingTest?param="+document.getElementById('mytest').value)
}

</script>

</body>

</html>
