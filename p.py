import hashlib
file = open("hash.txt","r")

for i in file:
    i = i.encode('utf-8')
    msg = hashlib.md5(i.strip())
    d = msg.hexdigest()
    print(i)
    
    