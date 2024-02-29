package constant.domain;

import domain.Command;

import static domain.Name.MAX_OF_NAME_LENGTH;

public enum NameExceptionMessage {

    NO_NAME("[ERROR] 이름이 없습니다."),
    OUT_OF_RANGE_NAME_LENGTH("[ERROR] 이름의 길이는 " + MAX_OF_NAME_LENGTH + "글자를 초과할 수 없습니다."),
    DISALLOWED_NAME("[ERROR] " + Command.getCommandToString() + "는 이름이 될 수 없습니다.");

    private final String exceptionMessage;

    NameExceptionMessage(String exceptionMessage) {
        this.exceptionMessage = exceptionMessage;
    }

    public String getExceptionMessage() {
        return this.exceptionMessage;
    }
}
