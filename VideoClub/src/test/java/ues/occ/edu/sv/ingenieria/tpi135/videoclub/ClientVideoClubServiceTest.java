/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ues.occ.edu.sv.ingenieria.tpi135.videoclub;

import junit.framework.TestCase;
import org.easymock.EasyMock;
import org.junit.jupiter.api.Test;

/**
 *
 * @author christian
 */
public class ClientVideoClubServiceTest extends TestCase {

    private IVideoClubService remoteVideoClubServiceMock;
    private IVideo video28Mock;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        remoteVideoClubServiceMock = EasyMock.createMock(IVideoClubService.class);
        video28Mock = EasyMock.createMock(IVideo.class);
    }

    public void testClientVideoClubService() {
        try {
            new ClientVideoClubService(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
        new ClientVideoClubService(remoteVideoClubServiceMock);
    }

    /**
     * Test of getVideo method, of class ClientVideoClubService.
     *
     */
    @Test
    public void testGetVideo() {
        EasyMock.expect(remoteVideoClubServiceMock.getVideo(28))
                .andReturn(video28Mock);
        EasyMock.replay(remoteVideoClubServiceMock);
        IVideoClubService clientVideoClubService
                = new ClientVideoClubService(remoteVideoClubServiceMock);
        IVideo result = clientVideoClubService.getVideo(28);
        assertEquals(video28Mock, result);
        EasyMock.verify(remoteVideoClubServiceMock);
    }

}
