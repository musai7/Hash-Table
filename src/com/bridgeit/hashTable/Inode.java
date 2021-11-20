package com.bridgeit.hashTable;

public interface Inode<K> {

	K getKey();

	void setKey(K key);

	void setNext(Inode<K> next);

	Inode<K> getNext();

}
