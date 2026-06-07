class Solution:

    def encode(self, strs: List[str]) -> str:
        r = ""

        for s in strs:
            r += str(len(s)) + "@" + s

        return r

    def decode(self, s: str) -> List[str]:
        r = []
        i = 0

        while i < len(s):
            j = i

            while s[j] != "@":
                j += 1

            length = int(s[i:j])

            r.append(s[j + 1 : j + 1 + length])

            i = j + 1 + length

        return r