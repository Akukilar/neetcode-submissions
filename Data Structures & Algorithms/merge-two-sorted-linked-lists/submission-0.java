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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode dummy = new ListNode(0);
        ListNode node = dummy;

        // Mientras las 2 listas no sean nulas
        while (list1 != null && list2 != null) {

            // Comprobar que valor es mayor
            if (list1.val < list2.val) {

                // Insertamos el siguente nodo de la lista (realmente sera el comienzo)
                node.next = list1;
                // Pasamos al siguiente valor de la lista1
                list1 = list1.next;
            } else {
                // Lo mismo que arriba
                node.next = list2;
                list2 = list2.next;
            }

            // Pasamos al siguente valor de la lista que estamos creando
            node = node.next;
        }

        if (list1 == null) {
            node.next = list2;
        }else {
            node.next = list1;
        }

        // Devolvemos el primer nodo que hemos insertado (el siguente del dummy)
        return dummy.next;
    }
}