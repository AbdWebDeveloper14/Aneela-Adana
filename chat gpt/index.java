// Example fetching video data from an API
document.addEventListener('DOMContentLoaded', () => {
    fetch('https://api.example.com/videos')
        .then(response => response.json())
        .then(data => {
            const videosContainer = document.querySelector('.videos');
            data.forEach(video => {
                const videoElement = document.createElement('div');
                videoElement.classList.add('video');
                videoElement.innerHTML = `
                    <h3>${video.title}</h3>
                    <iframe width="560" height="315" src="https://www.youtube.com/embed/${video.videoId}" frameborder="0" allowfullscreen></iframe>
                `;
                videosContainer.appendChild(videoElement);
            });
        })
        .catch(error => {
            console.error('Error fetching videos:', error);
        });
});
