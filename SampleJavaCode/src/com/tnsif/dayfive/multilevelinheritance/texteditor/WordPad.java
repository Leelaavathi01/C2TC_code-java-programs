//Program to define child class Wordpad with formatting text feature
package com.tnsif.dayfive.multilevelinheritance.texteditor;

public class WordPad extends Notepad {
    private boolean isBold;

    public WordPad() {
        super();
        this.isBold = false;
    }

    public void formatText(boolean bold) {
        if (bold) {
            content = "<b>" + content + "</b>";
        }
        isBold = bold;
    }

    public boolean isBold() {
        return isBold;
    }
}