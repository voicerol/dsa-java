# Linked Lists

This project was created to familiarize with linked lists, their application, and implementation.

## What is a Linked List?

A linked list is a basic dynamic data structure consisting of nodes, each of which contains a value and a reference to the next node. The first element of the list is called the Head, and the last one is the Tail, which points to NULL.

Linked lists are similar to arrays; however, adding and removing elements from the middle or the beginning of the list is easier, as there’s no need to change the indices of all subsequent elements. An array is a continuous block of memory, with each element located after the other. A linked list is a chain of objects.

## What Types of Linked Lists Are There?

There are several types of linked lists:
- Singly Linked List
- Doubly Linked List
- Circular Linked List

## What Are Their Differences?

A doubly linked list differs from a singly linked list only in that each node has a pointer not only to the next neighbor but also to the previous one.

A circular linked list is different from the others in that the last element points to the first element, making the list closed or circular.

## Basic Operations of Linked Lists:

- Addition
- Deletion
- Display
- Search

## Implementation:

The basic element of the list is a node (Node) with fields `value`, `next`, and `prev`.

The list itself also has an initial set of properties:
- `head` - the entry point, the initial element of the list.
- `tail` - the last element of the list.
- `length` - the number of elements in the list.

## Methods:

Methods are the actions we can use to manage the list. As mentioned earlier, we can use on basic operations.

We add the necessary methods for each type of linked list class and reference them using objects.

## Pros and Cons of Linked Lists

**Pros:**
- Ordered
- Flexible size

**Cons:**
- Consumes a lot of memory
- Some operations may be inefficient due to poor algorithm design.
