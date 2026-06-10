class Solution:
    def capitalizeTitle(self, title: str) -> str:
        s=""
        for i in title.split():
            if len(i)<3:
                s+=i.lower()+" "
            else:
                s+=i.capitalize()+" "
        return s.strip()      
