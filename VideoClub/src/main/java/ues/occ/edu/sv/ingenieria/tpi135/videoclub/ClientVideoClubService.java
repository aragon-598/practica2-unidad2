/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ues.occ.edu.sv.ingenieria.tpi135.videoclub;

/**
 *
 * @author aragon598
 */
public class ClientVideoClubService implements IVideoClubService {

    private IVideoClubService remoteVideoClubService;

    public ClientVideoClubService(IVideoClubService remoteVideoClubService) {

        if (remoteVideoClubService == null) {
            throw new IllegalArgumentException("'remoteVideoClubService' must not be null");
        }
        this.remoteVideoClubService = remoteVideoClubService;
    }

    public IVideo getVideo(int videoNumber) {
        return remoteVideoClubService.getVideo(videoNumber);
    }

}
