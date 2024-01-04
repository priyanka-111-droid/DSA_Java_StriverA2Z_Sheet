//ERROR IN JAVA CODE, SUBMITTED IN C++.

/**
 * Definition of doubly linked list:
 * class Node {
 * public:
 *      int data;
 *      Node *prev;
 *      Node *next;
 *      Node() {
 *          this->data = 0;
 *          this->prev = NULL;
 *          this->next = NULL;
 *      }
 *      Node(int data) {
 *          this->data = data;
 *          this->prev = NULL;
 *          this->next = NULL;
 *      }
 *      Node (int data, Node *next, Node *prev) {
 *          this -> data = data;
 *          this -> prev = prev;
 *          this -> next = next;
 *      }
 * };
 *
 *************************************************************************/
/*
#include <iostream>
#include <vector>
#include <unordered_set>
vector<pair<int, int>> findPairs(Node* head, int k)
        {
        // Write your code here.
        vector<std::pair<int, int>> result;
        unordered_set<int> seen_values;

        Node* temp = head;

        while (temp != nullptr) {
        int complement = k - temp->data;

        // Check if the complement value is in the set of seen values
        if (seen_values.count(complement)) {
        result.push_back({temp->data, complement});
        }

        // Add the current data value to the set of seen values
        seen_values.insert(temp->data);

        temp = temp->next;
        }

        return result;

        }

 */