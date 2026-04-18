# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next


# temp pointer -> nxt = prev
# pointer -> prev = None
# pointer 2 -> curr = head


class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:

        # Variables (prev -> Nodo anterior) (curr -> Nodo Actual)
        prev, curr = None, head 

        # Recorrer la "Linked List"
        while curr:
            # Guardo el siguiente nodo de la lista
            temp = curr.next 

            # Cambio el siguiente nodo al anterior(cambio la direccion del nodo a el anterior)
            curr.next = prev

            # El nodo actual pasa a ser el antiguo
            prev = curr

            # El siguiente nodo sera el actual
            curr = temp

        # devolvemos la head  
        return prev

