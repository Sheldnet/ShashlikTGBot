package com.rimut.ShashlikBot.service.command;

import com.rimut.ShashlikBot.service.TelegramBot;
import org.telegram.telegrambots.meta.api.objects.Update;

public class StartCommand implements Command{
    @Override
    public void execute(Update update, TelegramBot telegramBot) {
        telegramBot.registerUser(update.getMessage());
        telegramBot.startCommanReceived(update.getMessage().getChatId(), update.getMessage().getChat().getFirstName());
    }
}
