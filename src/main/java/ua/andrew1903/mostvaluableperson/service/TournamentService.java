package ua.andrew1903.mostvaluableperson.service;

import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

public interface TournamentService {

    Map<String, Object> parse(MultipartFile[] files);

}
