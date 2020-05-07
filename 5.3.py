import re
text ='site sea suede sweet see kase sse ssee loses'
print(re.findall(r'\bs\S*?e\b',text))