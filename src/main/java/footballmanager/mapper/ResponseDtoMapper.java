package footballmanager.mapper;

public interface ResponseDtoMapper<D, M> {
    D mapToDto(M model);
}