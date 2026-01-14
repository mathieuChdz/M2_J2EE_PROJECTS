package fr.amis.tp1.service;

import fr.amis.tp1.entity.Questions;

public class FournisseurDeQuestions implements InterfaceFournisseurDeQuestions{
    Questions lesQuestions;

    public void genereQuestionnaire() {
        System.out.println(lesQuestions.popLesQuestions());
    }

    public void setLesQuestions(Questions lesQuestions) {
        this.lesQuestions = lesQuestions;
    }
}
