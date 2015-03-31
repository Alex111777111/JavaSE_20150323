package ru.javacourse.mail;

public class MessageQueue {
    private MessageBox head = null;
    private MessageBox tail = null;
    private int size = 0;

    public int push(MailMessage message) {
        MessageBox mb = new MessageBox();
        mb.setMessage(message);

        if (head == null) {
            head = mb;
        } else {
            tail.setNext(mb);
        }
        tail = mb;
        size++;
        return size;
    }

    public int size() {
        return size;
    }

    public MailMessage pull() {
        if (head != null) {
            MailMessage mm = head.getMessage();
            head = head.getNext();
            if (head == null) {
                tail = null;
            }
            size--;
            return mm;
        }
        return null;
    }

    public MailMessage getMessage(int index) {
        if (index > size - 1 || index < 0 || size == 0) {
            return null;
        }
        if (index == size - 1) {
            return tail.getMessage();
        }
        int count = 0;
        MessageBox mb = head;
        while (count < index) {
            count++;
            mb = mb.getNext();
        }
        return mb.getMessage();
    }
}

class MessageBox {
    private MailMessage message;
    private MessageBox next;

    public MailMessage getMessage() {
        return message;
    }

    public void setMessage(MailMessage message) {
        this.message = message;
    }

    public MessageBox getNext() {
        return next;
    }

    public void setNext(MessageBox next) {
        this.next = next;
    }
}
