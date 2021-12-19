# TestLog4j
The log4j vulnerability test.

Details of the vulnerability is at https://logging.apache.org/log4j/2.x/security.html

Check the details of the vulnerability CVE-2021-45105 which is fixed in the Log4j version 2.17.0

input paramter value to cause recursion : ${ctx:${ctx:query}}, url encode it before passing


The url :
http://localhost:7002/resources/1?query=%24%7Bctx%3A%24%7Bctx%3Aquery%7D%7D



