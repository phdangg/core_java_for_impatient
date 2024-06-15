package Chapter4;

public sealed interface StringList permits EmptyStringList, NonEmptyStringList{
    int size();
    StringList append(StringList other);
}
