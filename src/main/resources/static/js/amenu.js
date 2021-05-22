document.addEventListener("DOMContentLoaded", () => {
        var add = document.getElementById('add');
        var list = document.getElementById('list');
        var add_btn = document.getElementById('add-btn');
        var exit_btn = document.getElementById('exit');

        add_btn.onclick = () => {
          add.classList.remove('d-none');
          list.classList.add('d-none');
        }
        exit_btn.onclick = () => {
          add.classList.add('d-none');
          list.classList.remove('d-none');
        }
      })