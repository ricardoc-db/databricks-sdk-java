package com.databricks.sdk.service.jobs;

import com.databricks.sdk.core.ApiClient;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.*;

@ExtendWith(MockitoExtension.class)
public class JobsImplTest {
    @Mock
    ApiClient apiClient;

    /*
     * API 2.1 pinned endpoints check
     * See: https://databricks.atlassian.net/browse/JOBS-19304
     */

    @Test
    public void testJobsCreateUsesApi2_1() {
        JobsService jobs = new JobsImpl(apiClient);
        jobs.create(new CreateJob());

        Mockito.verify(apiClient).POST(eq("/api/2.1/jobs/create"), any(), any(), any());
    }

    @Test
    public void testJobsGetUsesApi2_1() {
        JobsService jobs = new JobsImpl(apiClient);
        jobs.get(new GetJobRequest());

        Mockito.verify(apiClient).GET(eq("/api/2.1/jobs/get"), any(), any(), any());
    }

    @Test
    public void testJobsListUsesApi2_1() {
        JobsService jobs = new JobsImpl(apiClient);
        jobs.list(new ListJobsRequest());

        Mockito.verify(apiClient).GET(eq("/api/2.1/jobs/list"), any(), any(), any());
    }

    @Test
    public void testJobsUpdateUsesApi2_1() {
        JobsService jobs = new JobsImpl(apiClient);
        jobs.update(new UpdateJob());

        Mockito.verify(apiClient).POST(eq("/api/2.1/jobs/update"), any(), any(), any());
    }

    @Test
    public void testJobsResetUsesApi2_1() {
        JobsService jobs = new JobsImpl(apiClient);
        jobs.reset(new ResetJob());

        Mockito.verify(apiClient).POST(eq("/api/2.1/jobs/reset"), any(), any(), any());
    }

    @Test
    public void testJobsListRunsUsesApi2_1() {
        JobsService jobs = new JobsImpl(apiClient);
        jobs.listRuns(new ListRunsRequest());

        Mockito.verify(apiClient).GET(eq("/api/2.1/jobs/runs/list"), any(), any(), any());
    }
}
