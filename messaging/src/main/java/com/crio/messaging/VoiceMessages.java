package com.crio.messaging;

import com.crio.messaging.Message;

class VoiceMessage extends Message{

    private String voiceContent;
    private String voiceDuration;
    private String voiceQuality;

    public String getVoiceContent() {
        return voiceContent;
    }
    public void setVoiceContent(String voiceContent) {
        this.voiceContent = voiceContent;
    }

    public int getMessageContentSize(){
        return voiceContent.length();
    }

    
}