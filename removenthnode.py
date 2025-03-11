class ListNode(object):
    def __init__(self, val=0, next=None):
         self.val = val
         self.next = next

class Solution(object):
    def removeNthFromEnd(self, head, n=int):
        dummy = ListNode(0, head)
        first = dummy
        second= dummy

        for _ in range(n+1):
            first = first.next

        while first:
            first=first.next
            second= second.next

        second.next = second.next.next

        return dummy.next