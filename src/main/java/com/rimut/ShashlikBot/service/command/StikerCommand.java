package com.rimut.ShashlikBot.service.command;

import com.rimut.ShashlikBot.service.TelegramBot;
import org.telegram.telegrambots.meta.api.objects.Update;

public class StikerCommand implements Command{
    @Override
    public void execute(Update update, TelegramBot telegramBot) {
        telegramBot.sendSticker(update.getUpdateId());
    }
}
