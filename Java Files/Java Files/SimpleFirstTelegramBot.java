import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.ParseMode;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import java.util.ArrayList;
import java.util.List;

public class SimpleFirstTelegramBot extends TelegramLongPollingBot {
    @Override
    public void onUpdateReceived(Update update) {
        Burgers burgers = new Burgers();
        Beverages beverages = new Beverages();
        Fries fries = new Fries();
        CalculateThePrice calculateThePrice = new CalculateThePrice();
        if (update.hasMessage()) {
            Message message = update.getMessage();
            if (message.hasText()) {
                String text = message.getText();
                if (text.equals("/run")) {
                        calculateThePrice.restartOrder();
                        SendMessage sendMessage = new SendMessage();
                        sendMessage.setText("Choose food:");
                        sendMessage.setParseMode(ParseMode.MARKDOWN);
                        sendMessage.setChatId(String.valueOf(message.getChatId()));
                        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
                        replyKeyboardMarkup.setResizeKeyboard(true);
                        List<KeyboardRow> buttonRowList = new ArrayList<>();
                        KeyboardRow buttonsRow1 = new KeyboardRow();
                        KeyboardRow buttonsRow2 = new KeyboardRow();
                        KeyboardButton button1 = new KeyboardButton();
                        KeyboardButton button2 = new KeyboardButton();
                        KeyboardButton button3 = new KeyboardButton();
                        KeyboardButton button4 = new KeyboardButton();
                        KeyboardButton button5 = new KeyboardButton();
                        button1.setText(burgers.getFoodMenu());
                        button2.setText(beverages.getFoodMenu());
                        button3.setText(fries.getFoodMenu());
                        button4.setText("Calculate final Price");
                        button5.setText("Exit");
                        buttonsRow1.add(button1);
                        buttonsRow1.add(button2);
                        buttonsRow1.add(button3);
                        buttonsRow2.add(button4);
                        buttonsRow2.add(button5);
                        buttonRowList.add(buttonsRow1);
                        buttonRowList.add(buttonsRow2);
                        replyKeyboardMarkup.setKeyboard(buttonRowList);
                        sendMessage.setReplyMarkup(replyKeyboardMarkup);
                        try {
                            execute(sendMessage);
                        } catch (TelegramApiException E) {
                            E.printStackTrace();
                        }
                    }
                    else if (text.equals("Burger") {
                        SendMessage sendMessage = new SendMessage();
                        sendMessage.setText("Choose burger, please:");
                        sendMessage.setParseMode(ParseMode.MARKDOWN);
                        sendMessage.setChatId(String.valueOf(message.getChatId()));
                        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
                        replyKeyboardMarkup.setResizeKeyboard(true);
                        List<KeyboardRow> buttonRowList = new ArrayList<>();
                        KeyboardRow buttonsRow1 = new KeyboardRow();
                        KeyboardRow buttonsRow2 = new KeyboardRow();
                        KeyboardButton button1 = new KeyboardButton();
                        KeyboardButton button2 = new KeyboardButton();
                        KeyboardButton button3 = new KeyboardButton();
                        KeyboardButton button4 = new KeyboardButton();
                        button1.setText(burgers.getFoodName()[1] + " - " + burgers.getFoodPrice()[1]);
                        button2.setText(burgers.getFoodName()[2] + " - " + burgers.getFoodPrice()[2]);
                        button3.setText(burgers.getFoodName()[3] + " - " + burgers.getFoodPrice()[3]);
                        button4.setText("Exit");
                        buttonsRow1.add(button1);
                        buttonsRow1.add(button2);
                        buttonsRow1.add(button3);
                        buttonsRow2.add(button4);
                        buttonRowList.add(buttonsRow1);
                        buttonRowList.add(buttonsRow2);
                        replyKeyboardMarkup.setKeyboard(buttonRowList);
                        sendMessage.setReplyMarkup(replyKeyboardMarkup);
                        try {
                            execute(sendMessage);
                        } catch (TelegramApiException E) {
                            E.printStackTrace();
                        }
                    } else if(text.equals("Beverages")){
                        SendMessage sendMessage = new SendMessage();
                        sendMessage.setText("Choose beverage:");
                        sendMessage.setParseMode(ParseMode.MARKDOWN);
                        sendMessage.setChatId(String.valueOf(message.getChatId()));
                        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
                        replyKeyboardMarkup.setResizeKeyboard(true);
                        List<KeyboardRow> buttonRowList = new ArrayList<>();
                        KeyboardRow buttonsRow1 = new KeyboardRow();
                        KeyboardRow buttonsRow2 = new KeyboardRow();
                        KeyboardButton button1 = new KeyboardButton();
                        KeyboardButton button2 = new KeyboardButton();
                        KeyboardButton button3 = new KeyboardButton();
                        KeyboardButton button4 = new KeyboardButton();
                        KeyboardButton button5 = new KeyboardButton();
                        KeyboardButton button6 = new KeyboardButton();
                        button1.setText(beverages.getFoodName()[1] + " - " + beverages.getFoodPrice()[1]);
                        button2.setText(beverages.getFoodName()[2] + " - " + beverages.getFoodPrice()[2]);
                        button3.setText(beverages.getFoodName()[3] + " - " + beverages.getFoodPrice()[3]);
                        button4.setText(beverages.getFoodName()[4] + " - " + beverages.getFoodPrice()[4]);
                        button5.setText(beverages.getFoodName()[5] + " - " + beverages.getFoodPrice()[5]);
                        button6.setText("Exit");
                        buttonsRow1.add(button1);
                        buttonsRow1.add(button2);
                        buttonsRow1.add(button3);
                        buttonsRow1.add(button4);
                        buttonsRow1.add(button5);
                        buttonsRow2.add(button4);
                        buttonRowList.add(buttonsRow1);
                        buttonRowList.add(buttonsRow2);
                        replyKeyboardMarkup.setKeyboard(buttonRowList);
                        sendMessage.setReplyMarkup(replyKeyboardMarkup);
                        try {
                            execute(sendMessage);
                        } catch (TelegramApiException E) {
                            E.printStackTrace();
                        }
                    } else if (text.equals("Fries")) {
                        SendMessage sendMessage = new SendMessage();
                        sendMessage.setText("Choose fries:");
                        sendMessage.setParseMode(ParseMode.MARKDOWN);
                        sendMessage.setChatId(String.valueOf(message.getChatId()));
                        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
                        replyKeyboardMarkup.setResizeKeyboard(true);
                        List<KeyboardRow> buttonRowList = new ArrayList<>();
                        KeyboardRow buttonsRow1 = new KeyboardRow();
                        KeyboardRow buttonsRow2 = new KeyboardRow();
                        KeyboardButton button1 = new KeyboardButton();
                        KeyboardButton button2 = new KeyboardButton();
                        KeyboardButton button3 = new KeyboardButton();
                        KeyboardButton button4 = new KeyboardButton();
                        button1.setText(fries.getFoodName()[1] + " - " + fries.getFoodPrice()[1]);
                        button2.setText(fries.getFoodName()[2] + " - " + fries.getFoodPrice()[2]);
                        button3.setText(fries.getFoodName()[3] + " - " + fries.getFoodPrice()[3]);
                        button4.setText("Exit");
                        buttonsRow1.add(button1);
                        buttonsRow1.add(button2);
                        buttonsRow1.add(button3);
                        buttonsRow2.add(button4);
                        buttonRowList.add(buttonsRow1);
                        buttonRowList.add(buttonsRow2);
                        replyKeyboardMarkup.setKeyboard(buttonRowList);
                        sendMessage.setReplyMarkup(replyKeyboardMarkup);
                        try {
                            execute(sendMessage);
                        } catch (TelegramApiException E) {
                            E.printStackTrace();
                        }
                    } else if(text.equals("Calculate final Price")){
                        SendMessage sendMessage = new SendMessage();
                        sendMessage.setText("Your total price - " + calculateThePrice.getTotalPrice() + "\n" + "Your Order Will be Delivered!" + "\n" + "Bye");
                        sendMessage.setParseMode(ParseMode.MARKDOWN);
                        sendMessage.setChatId(String.valueOf(message.getChatId()));
                        try {
                            execute(sendMessage);
                        } catch (TelegramApiException E) {
                            E.printStackTrace();
                        }
                    }
                } else if(text.equals("Calculate final Price")){
                        SendMessage sendMessage = new SendMessage();
                        sendMessage.setText("Your order is cancelled" + "\n" + "Total price - " + calculateThePrice.restartOrder() + "\n" + "Bye");
                        sendMessage.setParseMode(ParseMode.MARKDOWN);
                        sendMessage.setChatId(String.valueOf(message.getChatId()));
                        try {
                            execute(sendMessage);
                        } catch (TelegramApiException E) {
                            E.printStackTrace();
                        }
                        break;
                    }
                    case "Chicken burger - 600": {
                        SendMessage sendMessage = new SendMessage();
                        sendMessage.setText("Choose food:");
                        sendMessage.setParseMode(ParseMode.MARKDOWN);
                        sendMessage.setChatId(String.valueOf(message.getChatId()));
                        calculateThePrice.setTotalPrice(600);
                        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
                        replyKeyboardMarkup.setResizeKeyboard(true);
                        List<KeyboardRow> buttonRowList = new ArrayList<>();
                        KeyboardRow buttonsRow1 = new KeyboardRow();
                        KeyboardRow buttonsRow2 = new KeyboardRow();
                        KeyboardButton button1 = new KeyboardButton();
                        KeyboardButton button2 = new KeyboardButton();
                        KeyboardButton button3 = new KeyboardButton();
                        KeyboardButton button4 = new KeyboardButton();
                        KeyboardButton button5 = new KeyboardButton();
                        button1.setText(burgers.getFoodMenu());
                        button2.setText(beverages.getFoodMenu());
                        button3.setText(fries.getFoodMenu());
                        button4.setText("Calculate final Price");
                        button5.setText("Exit");
                        buttonsRow1.add(button1);
                        buttonsRow1.add(button2);
                        buttonsRow1.add(button3);
                        buttonsRow2.add(button4);
                        buttonsRow2.add(button5);
                        buttonRowList.add(buttonsRow1);
                        buttonRowList.add(buttonsRow2);
                        replyKeyboardMarkup.setKeyboard(buttonRowList);
                        sendMessage.setReplyMarkup(replyKeyboardMarkup);
                        try {
                            execute(sendMessage);
                        } catch (TelegramApiException E) {
                            E.printStackTrace();
                        }
                        break;
                    }
                    case "Beef burger - 800 tg": {
                        SendMessage sendMessage = new SendMessage();
                        sendMessage.setText("Choose food:");
                        sendMessage.setParseMode(ParseMode.MARKDOWN);
                        sendMessage.setChatId(String.valueOf(message.getChatId()));
                        calculateThePrice.setTotalPrice(800);
                        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
                        replyKeyboardMarkup.setResizeKeyboard(true);
                        List<KeyboardRow> buttonRowList = new ArrayList<>();
                        KeyboardRow buttonsRow1 = new KeyboardRow();
                        KeyboardRow buttonsRow2 = new KeyboardRow();
                        KeyboardButton button1 = new KeyboardButton();
                        KeyboardButton button2 = new KeyboardButton();
                        KeyboardButton button3 = new KeyboardButton();
                        KeyboardButton button4 = new KeyboardButton();
                        KeyboardButton button5 = new KeyboardButton();
                        button1.setText(burgers.getFoodMenu());
                        button2.setText(beverages.getFoodMenu());
                        button3.setText(fries.getFoodMenu());
                        button4.setText("Calculate final Price");
                        button5.setText("Exit");
                        buttonsRow1.add(button1);
                        buttonsRow1.add(button2);
                        buttonsRow1.add(button3);
                        buttonsRow2.add(button4);
                        buttonsRow2.add(button5);
                        buttonRowList.add(buttonsRow1);
                        buttonRowList.add(buttonsRow2);
                        replyKeyboardMarkup.setKeyboard(buttonRowList);
                        sendMessage.setReplyMarkup(replyKeyboardMarkup);
                        try {
                            execute(sendMessage);
                        } catch (TelegramApiException E) {
                            E.printStackTrace();
                        }
                        break;
                    }
                    case "Fish burger - 1000": {
                        SendMessage sendMessage = new SendMessage();
                        sendMessage.setText("Choose food:");
                        sendMessage.setParseMode(ParseMode.MARKDOWN);
                        sendMessage.setChatId(String.valueOf(message.getChatId()));
                        calculateThePrice.setTotalPrice(1000);
                        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
                        replyKeyboardMarkup.setResizeKeyboard(true);
                        List<KeyboardRow> buttonRowList = new ArrayList<>();
                        KeyboardRow buttonsRow1 = new KeyboardRow();
                        KeyboardRow buttonsRow2 = new KeyboardRow();
                        KeyboardButton button1 = new KeyboardButton();
                        KeyboardButton button2 = new KeyboardButton();
                        KeyboardButton button3 = new KeyboardButton();
                        KeyboardButton button4 = new KeyboardButton();
                        KeyboardButton button5 = new KeyboardButton();
                        button1.setText(burgers.getFoodMenu());
                        button2.setText(beverages.getFoodMenu());
                        button3.setText(fries.getFoodMenu());
                        button4.setText("Calculate final Price");
                        button5.setText("Exit");
                        buttonsRow1.add(button1);
                        buttonsRow1.add(button2);
                        buttonsRow1.add(button3);
                        buttonsRow2.add(button4);
                        buttonsRow2.add(button5);
                        buttonRowList.add(buttonsRow1);
                        buttonRowList.add(buttonsRow2);
                        replyKeyboardMarkup.setKeyboard(buttonRowList);
                        sendMessage.setReplyMarkup(replyKeyboardMarkup);
                        try {
                            execute(sendMessage);
                        } catch (TelegramApiException E) {
                            E.printStackTrace();
                        }
                        break;
                    }
                    case "Coke - 200": {
                        SendMessage sendMessage = new SendMessage();
                        sendMessage.setText("Choose food:");
                        sendMessage.setParseMode(ParseMode.MARKDOWN);
                        sendMessage.setChatId(String.valueOf(message.getChatId()));
                        calculateThePrice.setTotalPrice(200);
                        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
                        replyKeyboardMarkup.setResizeKeyboard(true);
                        List<KeyboardRow> buttonRowList = new ArrayList<>();
                        KeyboardRow buttonsRow1 = new KeyboardRow();
                        KeyboardRow buttonsRow2 = new KeyboardRow();
                        KeyboardButton button1 = new KeyboardButton();
                        KeyboardButton button2 = new KeyboardButton();
                        KeyboardButton button3 = new KeyboardButton();
                        KeyboardButton button4 = new KeyboardButton();
                        KeyboardButton button5 = new KeyboardButton();
                        button1.setText(burgers.getFoodMenu());
                        button2.setText(beverages.getFoodMenu());
                        button3.setText(fries.getFoodMenu());
                        button4.setText("Calculate final Price");
                        button5.setText("Exit");
                        buttonsRow1.add(button1);
                        buttonsRow1.add(button2);
                        buttonsRow1.add(button3);
                        buttonsRow2.add(button4);
                        buttonsRow2.add(button5);
                        buttonRowList.add(buttonsRow1);
                        buttonRowList.add(buttonsRow2);
                        replyKeyboardMarkup.setKeyboard(buttonRowList);
                        sendMessage.setReplyMarkup(replyKeyboardMarkup);
                        try {
                            execute(sendMessage);
                        } catch (TelegramApiException E) {
                            E.printStackTrace();
                        }
                        break;
                    }
                    case "Sprite - 190": {
                        SendMessage sendMessage = new SendMessage();
                        sendMessage.setText("Choose food:");
                        sendMessage.setParseMode(ParseMode.MARKDOWN);
                        sendMessage.setChatId(String.valueOf(message.getChatId()));
                        calculateThePrice.setTotalPrice(190);
                        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
                        replyKeyboardMarkup.setResizeKeyboard(true);
                        List<KeyboardRow> buttonRowList = new ArrayList<>();
                        KeyboardRow buttonsRow1 = new KeyboardRow();
                        KeyboardRow buttonsRow2 = new KeyboardRow();
                        KeyboardButton button1 = new KeyboardButton();
                        KeyboardButton button2 = new KeyboardButton();
                        KeyboardButton button3 = new KeyboardButton();
                        KeyboardButton button4 = new KeyboardButton();
                        KeyboardButton button5 = new KeyboardButton();
                        button1.setText(burgers.getFoodMenu());
                        button2.setText(beverages.getFoodMenu());
                        button3.setText(fries.getFoodMenu());
                        button4.setText("Calculate final Price");
                        button5.setText("Exit");
                        buttonsRow1.add(button1);
                        buttonsRow1.add(button2);
                        buttonsRow1.add(button3);
                        buttonsRow2.add(button4);
                        buttonsRow2.add(button5);
                        buttonRowList.add(buttonsRow1);
                        buttonRowList.add(buttonsRow2);
                        replyKeyboardMarkup.setKeyboard(buttonRowList);
                        sendMessage.setReplyMarkup(replyKeyboardMarkup);
                        try {
                            execute(sendMessage);
                        } catch (TelegramApiException E) {
                            E.printStackTrace();
                        }
                        break;
                    }
                    case "Fanta - 200": {
                        SendMessage sendMessage = new SendMessage();
                        sendMessage.setText("Choose food:");
                        sendMessage.setParseMode(ParseMode.MARKDOWN);
                        sendMessage.setChatId(String.valueOf(message.getChatId()));
                        calculateThePrice.setTotalPrice(200);
                        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
                        replyKeyboardMarkup.setResizeKeyboard(true);
                        List<KeyboardRow> buttonRowList = new ArrayList<>();
                        KeyboardRow buttonsRow1 = new KeyboardRow();
                        KeyboardRow buttonsRow2 = new KeyboardRow();
                        KeyboardButton button1 = new KeyboardButton();
                        KeyboardButton button2 = new KeyboardButton();
                        KeyboardButton button3 = new KeyboardButton();
                        KeyboardButton button4 = new KeyboardButton();
                        KeyboardButton button5 = new KeyboardButton();
                        button1.setText(burgers.getFoodMenu());
                        button2.setText(beverages.getFoodMenu());
                        button3.setText(fries.getFoodMenu());
                        button4.setText("Calculate final Price");
                        button5.setText("Exit");
                        buttonsRow1.add(button1);
                        buttonsRow1.add(button2);
                        buttonsRow1.add(button3);
                        buttonsRow2.add(button4);
                        buttonsRow2.add(button5);
                        buttonRowList.add(buttonsRow1);
                        buttonRowList.add(buttonsRow2);
                        replyKeyboardMarkup.setKeyboard(buttonRowList);
                        sendMessage.setReplyMarkup(replyKeyboardMarkup);
                        try {
                            execute(sendMessage);
                        } catch (TelegramApiException E) {
                            E.printStackTrace();
                        }
                        break;
                    }
                    case "Coffee - 300": {
                        SendMessage sendMessage = new SendMessage();
                        sendMessage.setText("Choose food:");
                        sendMessage.setParseMode(ParseMode.MARKDOWN);
                        sendMessage.setChatId(String.valueOf(message.getChatId()));
                        calculateThePrice.setTotalPrice(300);
                        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
                        replyKeyboardMarkup.setResizeKeyboard(true);
                        List<KeyboardRow> buttonRowList = new ArrayList<>();
                        KeyboardRow buttonsRow1 = new KeyboardRow();
                        KeyboardRow buttonsRow2 = new KeyboardRow();
                        KeyboardButton button1 = new KeyboardButton();
                        KeyboardButton button2 = new KeyboardButton();
                        KeyboardButton button3 = new KeyboardButton();
                        KeyboardButton button4 = new KeyboardButton();
                        KeyboardButton button5 = new KeyboardButton();
                        button1.setText(burgers.getFoodMenu());
                        button2.setText(beverages.getFoodMenu());
                        button3.setText(fries.getFoodMenu());
                        button4.setText("Calculate final Price");
                        button5.setText("Exit");
                        buttonsRow1.add(button1);
                        buttonsRow1.add(button2);
                        buttonsRow1.add(button3);
                        buttonsRow2.add(button4);
                        buttonsRow2.add(button5);
                        buttonRowList.add(buttonsRow1);
                        buttonRowList.add(buttonsRow2);
                        replyKeyboardMarkup.setKeyboard(buttonRowList);
                        sendMessage.setReplyMarkup(replyKeyboardMarkup);
                        try {
                            execute(sendMessage);
                        } catch (TelegramApiException E) {
                            E.printStackTrace();
                        }
                        break;
                    }
                    case "Tea - 250": {
                        SendMessage sendMessage = new SendMessage();
                        sendMessage.setText("Choose food:");
                        sendMessage.setParseMode(ParseMode.MARKDOWN);
                        sendMessage.setChatId(String.valueOf(message.getChatId()));
                        calculateThePrice.setTotalPrice(250);
                        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
                        replyKeyboardMarkup.setResizeKeyboard(true);
                        List<KeyboardRow> buttonRowList = new ArrayList<>();
                        KeyboardRow buttonsRow1 = new KeyboardRow();
                        KeyboardRow buttonsRow2 = new KeyboardRow();
                        KeyboardButton button1 = new KeyboardButton();
                        KeyboardButton button2 = new KeyboardButton();
                        KeyboardButton button3 = new KeyboardButton();
                        KeyboardButton button4 = new KeyboardButton();
                        KeyboardButton button5 = new KeyboardButton();
                        button1.setText(burgers.getFoodMenu());
                        button2.setText(beverages.getFoodMenu());
                        button3.setText(fries.getFoodMenu());
                        button4.setText("Calculate final Price");
                        button5.setText("Exit");
                        buttonsRow1.add(button1);
                        buttonsRow1.add(button2);
                        buttonsRow1.add(button3);
                        buttonsRow2.add(button4);
                        buttonsRow2.add(button5);
                        buttonRowList.add(buttonsRow1);
                        buttonRowList.add(buttonsRow2);
                        replyKeyboardMarkup.setKeyboard(buttonRowList);
                        sendMessage.setReplyMarkup(replyKeyboardMarkup);
                        try {
                            execute(sendMessage);
                        } catch (TelegramApiException E) {
                            E.printStackTrace();
                        }
                        break;
                    }
                    case "Big sized fries - 600": {
                        SendMessage sendMessage = new SendMessage();
                        sendMessage.setText("Choose next food:");
                        sendMessage.setParseMode(ParseMode.MARKDOWN);
                        sendMessage.setChatId(String.valueOf(message.getChatId()));
                        calculateThePrice.setTotalPrice(600);
                        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
                        replyKeyboardMarkup.setResizeKeyboard(true);
                        List<KeyboardRow> buttonRowList = new ArrayList<>();
                        KeyboardRow buttonsRow1 = new KeyboardRow();
                        KeyboardRow buttonsRow2 = new KeyboardRow();
                        KeyboardButton button1 = new KeyboardButton();
                        KeyboardButton button2 = new KeyboardButton();
                        KeyboardButton button3 = new KeyboardButton();
                        KeyboardButton button4 = new KeyboardButton();
                        KeyboardButton button5 = new KeyboardButton();
                        button1.setText(burgers.getFoodMenu());
                        button2.setText(beverages.getFoodMenu());
                        button3.setText(fries.getFoodMenu());
                        button4.setText("Calculate final Price");
                        button5.setText("Exit");
                        buttonsRow1.add(button1);
                        buttonsRow1.add(button2);
                        buttonsRow1.add(button3);
                        buttonsRow2.add(button4);
                        buttonsRow2.add(button5);
                        buttonRowList.add(buttonsRow1);
                        buttonRowList.add(buttonsRow2);
                        replyKeyboardMarkup.setKeyboard(buttonRowList);
                        sendMessage.setReplyMarkup(replyKeyboardMarkup);
                        try {
                            execute(sendMessage);
                        } catch (TelegramApiException E) {
                            E.printStackTrace();
                        }
                        break;
                    }
                    case "Small sized fries - 450": {
                        SendMessage sendMessage = new SendMessage();
                        sendMessage.setText("Choose food:");
                        sendMessage.setParseMode(ParseMode.MARKDOWN);
                        sendMessage.setChatId(String.valueOf(message.getChatId()));
                        calculateThePrice.setTotalPrice(450);
                        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
                        replyKeyboardMarkup.setResizeKeyboard(true);
                        List<KeyboardRow> buttonRowList = new ArrayList<>();
                        KeyboardRow buttonsRow1 = new KeyboardRow();
                        KeyboardRow buttonsRow2 = new KeyboardRow();
                        KeyboardButton button1 = new KeyboardButton();
                        KeyboardButton button2 = new KeyboardButton();
                        KeyboardButton button3 = new KeyboardButton();
                        KeyboardButton button4 = new KeyboardButton();
                        KeyboardButton button5 = new KeyboardButton();
                        button1.setText(burgers.getFoodMenu());
                        button2.setText(beverages.getFoodMenu());
                        button3.setText(fries.getFoodMenu());
                        button4.setText("Calculate final Price");
                        button5.setText("Exit");
                        buttonsRow1.add(button1);
                        buttonsRow1.add(button2);
                        buttonsRow1.add(button3);
                        buttonsRow2.add(button4);
                        buttonsRow2.add(button5);
                        buttonRowList.add(buttonsRow1);
                        buttonRowList.add(buttonsRow2);
                        replyKeyboardMarkup.setKeyboard(buttonRowList);
                        sendMessage.setReplyMarkup(replyKeyboardMarkup);
                        try {
                            execute(sendMessage);
                        } catch (TelegramApiException E) {
                            E.printStackTrace();
                        }
                        break;
                    }
                    case "Medium sized fries - 540": {
                        SendMessage sendMessage = new SendMessage();
                        sendMessage.setText("Choose next food:");
                        sendMessage.setParseMode(ParseMode.MARKDOWN);
                        sendMessage.setChatId(String.valueOf(message.getChatId()));
                        calculateThePrice.setTotalPrice(540);
                        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
                        replyKeyboardMarkup.setResizeKeyboard(true);
                        List<KeyboardRow> buttonRowList = new ArrayList<>();
                        KeyboardRow buttonsRow1 = new KeyboardRow();
                        KeyboardRow buttonsRow2 = new KeyboardRow();
                        KeyboardButton button1 = new KeyboardButton();
                        KeyboardButton button2 = new KeyboardButton();
                        KeyboardButton button3 = new KeyboardButton();
                        KeyboardButton button4 = new KeyboardButton();
                        KeyboardButton button5 = new KeyboardButton();
                        button1.setText(burgers.getFoodMenu());
                        button2.setText(beverages.getFoodMenu());
                        button3.setText(fries.getFoodMenu());
                        button4.setText("Calculate final Price");
                        button5.setText("Exit");
                        buttonsRow1.add(button1);
                        buttonsRow1.add(button2);
                        buttonsRow1.add(button3);
                        buttonsRow2.add(button4);
                        buttonsRow2.add(button5);
                        buttonRowList.add(buttonsRow1);
                        buttonRowList.add(buttonsRow2);
                        replyKeyboardMarkup.setKeyboard(buttonRowList);
                        sendMessage.setReplyMarkup(replyKeyboardMarkup);
                        try {
                            execute(sendMessage);
                        } catch (TelegramApiException E) {
                            E.printStackTrace();
                        }
                        break;
                    }
                }
            }
        }
    // TODO
}

    @Override
    public String getBotUsername() {
        // TODO
        return "@Nukoo01Bot";
    }

    @Override
    public String getBotToken() {
        // TODO
        return "5018763749:AAHWWMo2WRGkBRjVndo1V2Xt_UxMN0kzEmE";
    }
}
