domain =  ["en.wiki.org", "codesignal.com", "happy.net", "code.info"] 
domainType=[]
def domaintype(domain):
    for i in domain:
        com=i[-4:]
        if(com==".org"):
            domainType.append("organization")
        elif(com==".com"):
            domainType.append("commercial")
        elif(com==".net"):
            domainType.append("network")
        elif(com=="info"):
            domainType.append("information")
    return domainType
print(domaintype(domain))