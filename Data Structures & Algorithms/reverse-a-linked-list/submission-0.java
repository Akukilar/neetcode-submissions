/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode previous = null;
        ListNode nextCurrent = null;

        while (current != null) {
            
            //Guardamos el siguiente nodo
            nextCurrent = current.next;

            // Cambiamos la direccion del nodo (hacia atras)
            current.next = previous;

            // El nodo anterior ahora sera el actual (+1)
            previous = current;

            // El nodo actual ahora sera el siguiente (lo hemos guardado antes de perder el valor )
            current = nextCurrent;
        }
        return previous;

    }
}
