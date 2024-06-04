package com.rimut.ShashlikBot.service.command;

import com.rimut.ShashlikBot.service.TelegramBot;
import org.telegram.telegrambots.meta.api.objects.Update;

public class HelloCommand implements Command{
    @Override
    public void execute(Update update, TelegramBot bot) {
        bot.prepareAndSendMessage(update.getMessage().getChatId(), "HELP TEXT");
    }
}
