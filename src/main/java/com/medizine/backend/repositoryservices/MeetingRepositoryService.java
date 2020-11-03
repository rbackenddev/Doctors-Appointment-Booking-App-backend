package com.medizine.backend.repositoryservices;

import com.medizine.backend.dto.ZoomMeeting;
import com.medizine.backend.exchanges.ZoomMeetingRequest;

public interface MeetingRepositoryService {

    ZoomMeeting getById(String id);

    ZoomMeeting getByModuleIdAndType(String moduleId, String moduleType);

    ZoomMeeting createMeeting(ZoomMeeting zoomMeeting);

    ZoomMeeting patchMeeting(ZoomMeetingRequest zoomMeetingRequest, String id);

}
