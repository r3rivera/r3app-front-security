#Spring Security 
### Tech Stack
* Spring Security
* JWT
* OAUTH2
* Configuration Properties 
* JDK 16+

### Notes:
* Create a Certs in src/main/java/resources/certs folder
<code>openssl genrsa -out keypair.pem 2048</code>
* Extract public key
<code>openssl rsa -in keypair.pem -pubout -out public.pem</code>
* Create a PKCS-8 Format from private key
<code>openssl pkcs8 -topk8 -inform PEM -outform PEM -nocrypt -in keypair.pem -out private.pem</code>