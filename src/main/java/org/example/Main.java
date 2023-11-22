package org.example;

import org.example.block.Block;
import org.example.block.CompositeBlockImpl;
import org.example.structure.Wall;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Block block = new CompositeBlockImpl("red","wood");
       Block block1 = new CompositeBlockImpl("white","wood");

       CompositeBlockImpl compositeBlock = new CompositeBlockImpl();

       List<Block> blockList = new ArrayList<>();
       blockList.add(block);

       blockList.add(block1);
       compositeBlock.addListBlock(blockList);

       Wall wall = new Wall(compositeBlock.getBlocks());

        System.out.println(wall.findBlockByColor("white"));
        System.out.println(wall.findBlocksByMaterial("wood"));
        System.out.println(wall.count());
    }
}